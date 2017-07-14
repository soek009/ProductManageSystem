package com.productmanagesystem.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/4/5.
 */

public class T_User extends DataSupport{
    private String UserId;
    private String UserName;
    private String UserPassword;
    /**
     * per:0 最高权限管理员账号；
     * per:1 非管理员账号，除管理用户外所有权限；
     * per:2 普通售货员账号，只有销售权限
     */
    private int UserPer;
    private int UserTel;

    public int getUserTel() {
        return UserTel;
    }

    public void setUserTel(int userTel) {
        UserTel = userTel;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }

    public int getUserPer() {
        return UserPer;
    }

    public void setUserPer(int userPer) {
        UserPer = userPer;
    }
}
