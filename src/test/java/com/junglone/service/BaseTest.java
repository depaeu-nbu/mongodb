package com.junglone.service;

import com.alibaba.fastjson.JSON;
import com.junglone.common.LogDefault;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:
 * Created by JungLone on 2016/8/30 15:12.
 */
public class BaseTest {

    private static Logger logger = LogDefault.getLogger(BaseTest.class);
    protected static ApplicationContext ac;

    static {
        ac = new ClassPathXmlApplicationContext("config/applicationContext.xml");
    }

    protected void print(Object obj) {
        logger.info(JSON.toJSONString(obj));
    }

    @Before
    public void setUp() throws Exception {
        print("--------------------- Before ---------------------");
    }

    @After
    public void tearDown() throws Exception {
        print("--------------------- After ---------------------");
    }
}
