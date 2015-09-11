package com.smart.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xianyu.hxy on 2015/9/11.
 */
public class User implements Serializable {
    private int userId;
    private String userName;
    private String lastIp;
    private Date lastVist;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getLastVist() {
        return lastVist;
    }

    public void setLastVist(Date lastVist) {
        this.lastVist = lastVist;
    }
}
