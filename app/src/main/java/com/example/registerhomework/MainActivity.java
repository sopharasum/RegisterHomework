package com.example.registerhomework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTvFirstName, mTvEmail, mTvUsername, mTvPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTvFirstName = findViewById(R.id.tvFirstName);
        mTvEmail = findViewById(R.id.tvEmail);
        mTvUsername = findViewById(R.id.tvUsername);
        mTvPassword = findViewById(R.id.tvPassword);

        Intent intent = getIntent();
        if(intent != null)
        {
            String firstName = intent.getStringExtra("firstName");
            String lastName = intent.getStringExtra("lastName");
            String email = intent.getStringExtra("email");
            String username = intent.getStringExtra("username");
            String password = intent.getStringExtra("password");

            mTvFirstName.setText("Name: "+firstName+" "+lastName);
            mTvEmail.setText("Email: "+email);
            mTvUsername.setText("Username: "+username);
            mTvPassword.setText("Password: "+password);
        }
    }
}
