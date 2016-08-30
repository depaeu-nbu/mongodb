package com.junglone.domain;

import com.alibaba.fastjson.JSON;

import java.util.Date;

/**
 * Description:
 * Created by JungLone on 2016/8/29 16:52.
 */
public class User {

    private long nId;

    private String strName;

    private int nSex;

    private String strMobile;

    private Date dtCreateTime;


    public long getId() {
        return nId;
    }

    public void setId(long nId) {
        this.nId = nId;
    }

    public String getName() {
        return strName;
    }

    public void setName(String strName) {
        this.strName = strName;
    }

    public int getSex() {
        return nSex;
    }

    public void setSex(int nSex) {
        this.nSex = nSex;
    }

    public String getMobile() {
        return strMobile;
    }

    public void setMobile(String strMobile) {
        this.strMobile = strMobile;
    }

    public Date getCreateTime() {
        return dtCreateTime;
    }

    public void setCreateTime(Date dtCreateTime) {
        this.dtCreateTime = dtCreateTime;
    }
}
