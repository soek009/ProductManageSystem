package com.productmanagesystem.android.activity;

import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.productmanagesystem.android.R;
import com.productmanagesystem.android.services.DBHelper;
import com.productmanagesystem.android.services.Judge;

public class RegistActivity extends AppCompatActivity {

    public static RegistActivity registActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_regist);
        registActivity = this;
        EditText txtUserID = (EditText)findViewById(R.id.text_userid);
        EditText txtUserName = (EditText)findViewById(R.id.text_username);
        EditText txtUserPassword = (EditText)findViewById(R.id.text_password);
        EditText txtConformPassword = (EditText)findViewById(R.id.text_conformpassword);
        EditText txtUserTel = (EditText)findViewById(R.id.text_tel);
        String userID = txtUserID.getText().toString();
        String userName = txtUserName.getText().toString();
        String userPassword = txtUserPassword.getText().toString();
        String userConfromPassword = txtConformPassword.getText().toString();
        String userTel = txtUserTel.getText().toString();
        String[] userValues = {userID,userName,userPassword,userConfromPassword,userTel};
        













    }
}
