package com.productmanagesystem.android.services;

import com.productmanagesystem.android.db.T_User;

/**
 * Created by Administrator on 2017/4/12.
 */

public class DBHelper {
    public static boolean userSet(String[] values){
        try {
            T_User user = new T_User();
            user.setUserId(values[0]);
            user.setUserName(values[1]);
            user.setUserPassword(values[2]);
            user.setUserPer(2);//注册为最低权限，如需更改需用管理员账号修改权限。
            return true;
        }catch (Exception e)
        {
            return false;
        }
    }
}
