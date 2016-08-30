package com.junglone.dao.impl;

import com.mongodb.WriteResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.List;

/**
 * Description:
 * Created by JungLone on 2016/8/30 15:20.
 */
public class BaseMongoDAO {
    @Autowired
    private MongoTemplate mongoTemplate;

    protected void insert(Object objectToSave, String strCollectionName) {
        mongoTemplate.insert(objectToSave, strCollectionName);
    }

    protected WriteResult updateFirst(Query query, Update update, String strCollectionName) {
        return mongoTemplate.updateFirst(query, update, strCollectionName);
    }

    protected WriteResult updateMulti(Query query, Update update, String strCollectionName) {
        return mongoTemplate.updateMulti(query, update, strCollectionName);
    }

    protected WriteResult remove(Object object, String strCollectionName) {
        return mongoTemplate.remove(object, strCollectionName);
    }

    protected WriteResult remove(Query query, String strCollectionName) {
        return mongoTemplate.remove(query, strCollectionName);
    }

    protected <T> List<T> find(Query query, Class<T> entityClass, String strCollectionName) {
        return mongoTemplate.find(query, entityClass, strCollectionName);
    }

    protected <T> List<T> findAll(Class<T> entityClass, String strCollectionName) {
        return mongoTemplate.findAll(entityClass, strCollectionName);
    }

    protected <T> T findOne(Query query, Class<T> entityClass, String strCollectionName) {
        return mongoTemplate.findOne(query, entityClass, strCollectionName);
    }

    protected <T> T findById(Object objectId, Class<T> entityClass, String strCollectionName) {
        return mongoTemplate.findById(objectId, entityClass, strCollectionName);
    }

}
