package com.complete.project_nabishop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;


public class SignUp extends AppCompatActivity {
    Button signup;
    TextView tv;
    FrameLayout img_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        signup = (Button) findViewById(R.id.btn_sign_up);
        tv = (TextView) findViewById(R.id.tv_login) ;
        img_back = (FrameLayout) findViewById(R.id.img_back);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUp.this, Login.class);
                startActivity(intent);
            }
        });
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUp.this, Login.class);
                startActivity(intent);
            }
        });
        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUp.this, dashboard2.class);
                startActivity(intent);
            }
        });
    }
}