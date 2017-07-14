package com.productmanagesystem.android.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.productmanagesystem.android.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        Button btnLogin = (Button)findViewById(R.id.btn_login);
        Button btnRegister = (Button)findViewById(R.id.btn_register);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LogInActivity.class);
                startActivity(intent);
            }
        });
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RegistActivity.class);
                startActivity(intent);
            }
        });

//        T_User user = new T_User();
//        user.setUserId(001);
//        user.setUserName("admin");
//        user.setUserPassword("admin");
//        user.setUserPer(0);
//        user.save();
//        Button btnTest = (Button)findViewById(R.id.btn_test);
//        btnTest.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                List<T_User> users = DataSupport.findAll(T_User.class);
//                for(T_User user : users){
//                    Log.d("LogInActivity","userName is"+ user.getUserName());
//                    Toast.makeText(MainActivity.this,user.getUserName(),Toast.LENGTH_SHORT).show();
//                }
//            }
//        });


    }
}
