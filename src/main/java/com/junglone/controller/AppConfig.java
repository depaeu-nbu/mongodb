package com.junglone.controller;

import com.mongodb.Mongo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;

import java.rmi.UnknownHostException;

/**
 * Description:
 * Created by JungLone on 2016/8/29 17:46.
 */
@Configuration
public class AppConfig {

    /*
     * Use the standard Mongo driver API to create a com.mongodb.Mongo instance.
     */
    // public @Bean Mongo mongo() throws UnknownHostException {
    //     return new Mongo("10.253.1.244");
    // }

    /*
     * Factory bean that creates the com.mongodb.Mongo instance
     */
    public @Bean MongoClientFactoryBean mongo() {
        MongoClientFactoryBean mongo = new MongoClientFactoryBean();
        mongo.setHost("10.253.1.244");
        return mongo;
    }
}