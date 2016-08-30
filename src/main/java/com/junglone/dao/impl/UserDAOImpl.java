package com.junglone.dao.impl;

import com.junglone.dao.UserDAO;
import com.junglone.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;
import static org.springframework.data.mongodb.core.query.Update.update;

/**
 * Description:
 * Created by JungLone on 2016/8/29 16:58.
 */

@Repository("userDAO")
public class UserDAOImpl extends BaseMongoDAO implements UserDAO {
    @Override
    public void addUser(User user) {
        insert(user, user.getClass().getSimpleName());
    }

    @Override
    public void deleteUser(User user) {
        remove(query(where("strName").is(user.getName())), user.getClass().getSimpleName());
    }

    @Override
    public void updateUser(User user) {
        updateMulti(query(where("strName").is("Junglone")), update("nId", user.getId()), user.getClass().getSimpleName());
    }

    @Override
    public List<User> selectUserList(Map<String, Object> mapCondition) {
        return find(query(where("strName").is(mapCondition.get("name"))), User.class, mapCondition.get("strCollectionName").toString());
    }
}
