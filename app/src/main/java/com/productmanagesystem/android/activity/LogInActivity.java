package com.productmanagesystem.android.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.productmanagesystem.android.R;
import com.productmanagesystem.android.db.T_User;

import org.litepal.LitePal;
import org.litepal.crud.DataSupport;

import java.util.List;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);
        Button btnLogin = (Button) findViewById(R.id.btn_login);
        Button btnRegister = (Button) findViewById(R.id.btn_register);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LogInActivity.this,RegistActivity.class);
                startActivity(intent);
            }
        });



//        btnCreateDB.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                LitePal.getDatabase();
//                Toast.makeText(LogInActivity.this,"Database has created!",Toast.LENGTH_SHORT).show();
//            }
//        });
//        btnAddUser.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                T_User user = new T_User();
//                user.setUserId(001);
//                user.setUserName("grant");
//                user.setUserPassword("1234");
//                user.setUserPer(1);
//                user.save();
//            }
//        });
//        btnNextPage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                List<T_User> users = DataSupport.findAll(T_User.class);
//                for(T_User user : users){
//                    Log.d("LogInActivity","userName is"+ user.getUserName());
//                    Toast.makeText(LogInActivity.this,user.getUserName(),Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
    }
}
