package com.productmanagesystem.android.services;

import android.widget.Toast;

import com.productmanagesystem.android.activity.RegistActivity;

/**
 * Created by Administrator on 2017/4/6.
 */

public class Judge {
    public static void conformValues (String[] values) {
        String userID = values[0];
        String userName = values[1];
        String userPassword = values[2];
        String userConfromPassword = values[3];
        String userTel = values[4];

        if (userID != null) {
            if (userName != null) {
                if (userPassword != null) {
                    if (userPassword != userConfromPassword) {
                        if (userTel != null) {
                            if (userTel.length() != 11) {
                                
                            } else {
                                Toast.makeText(RegistActivity.registActivity, "Please input really tel", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(RegistActivity.registActivity, "Please input user tel", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(RegistActivity.registActivity, "Password is not match", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(RegistActivity.registActivity, "Please input password", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(RegistActivity.registActivity, "Please input username", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(RegistActivity.registActivity, "Please input userID", Toast.LENGTH_SHORT).show();
        }
    }


    public static boolean loginJudge(String[] values){

        return true;
    }

}
