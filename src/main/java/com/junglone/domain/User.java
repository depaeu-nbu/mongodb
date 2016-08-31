package com.junglone.domain;

import java.util.Date;

/**
 * Description:
 * Created by JungLone on 2016/8/29 16:52.
 */
public class User {

    private long lId;

    private String strUserName;

    private String strPassword;

    private String strName;

    private int nSex = -1;

    private String strMobile;

    private Date dtCreateTime;


    public long getId() {
        return lId;
    }

    public void setId(long nId) {
        this.lId = nId;
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

    public String getUserName() {
        return strUserName;
    }

    public void setUserName(String strUserName) {
        this.strUserName = strUserName;
    }

    public String getPassword() {
        return strPassword;
    }

    public void setPassword(String strPassword) {
        this.strPassword = strPassword;
    }
}
