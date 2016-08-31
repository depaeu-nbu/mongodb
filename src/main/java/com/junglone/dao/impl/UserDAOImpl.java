package com.junglone.dao.impl;

import com.alibaba.fastjson.JSON;
import com.junglone.common.util.StringUtil;
import com.junglone.dao.UserDAO;
import com.junglone.domain.User;
import com.mongodb.WriteResult;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

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
        System.out.println("user ==== " + JSON.toJSONString(user));
        Criteria criteria = new Criteria("lId");
        criteria.is(user.getId());

        System.out.println("criteria ==== " + JSON.toJSONString(criteria));

        Query query = new Query(criteria);
        System.out.println("query ==== " + JSON.toJSONString(query));

        WriteResult writeResult = remove(query, user.getClass().getSimpleName());
        System.out.println(JSON.toJSONString(writeResult));
        int nResult = writeResult.getN();
        System.out.println("strUpsertedId ===== " + writeResult.getUpsertedId());
        System.out.println("nResult ===== " + nResult);
    }

    @Override
    public void updateUser(User user) {
        System.out.println("user ==== " + JSON.toJSONString(user));
        Criteria criteria = new Criteria();
        System.out.println("criteria ==== " + JSON.toJSONString(criteria));

        Query query = new Query();
        query.addCriteria(criteria.where("lId").is(user.getId()));
        System.out.println("query ==== " + JSON.toJSONString(query));

        Update update = new Update();
        if (StringUtil.notBlank(user.getName())) {
            update.set("strName", user.getName());
        }
        if (-1 < user.getSex()) {
            update.set("nSex", user.getSex());
        }
        if (StringUtil.notBlank(user.getMobile())) {
            update.set("strMobile", user.getMobile());
        }

        System.out.println("update ==== " + JSON.toJSONString(update));

        WriteResult writeResult = updateFirst(query, update, user.getClass().getSimpleName());
        System.out.println(JSON.toJSONString(writeResult));
        int nResult = writeResult.getN();
        System.out.println("strUpsertedId ===== " + writeResult.getUpsertedId());
        System.out.println("nResult ===== " + nResult);
    }

    @Override
    public List<User> selectUserList(Map<String, Object> mapCondition) {
        Criteria criteria = new Criteria();
        Query query = new Query(criteria);

        return find(query, User.class, User.class.getSimpleName());
    }

    public User selectUserById(long lId) {
     // return findById(lId, User.class, User.class.getSimpleName());
        return findOne(new Query(new Criteria("lId").is(lId)), User.class, User.class.getSimpleName());
    }

    @Override
    public User selectUser(String strUserName, String strPassword) {
        Query query = new Query(new Criteria("strUserName").is(strUserName).and("strPassword").is(strPassword));
        System.out.println("query ===== " + JSON.toJSONString(query));
        return findOne(query, User.class, User.class.getSimpleName());
    }
}
