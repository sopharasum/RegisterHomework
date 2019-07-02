package com.example.registerhomework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.registerhomework.model.Account;

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
            Account account = intent.getParcelableExtra("data");
            mTvFirstName.setText(account.getFirstName()+" "+account.getLastName());
            mTvEmail.setText(account.getEmailAddress());
            mTvUsername.setText(account.getUsername());
            mTvPassword.setText(account.getPassword());


            /*String firstName = intent.getStringExtra("firstName");
            String lastName = intent.getStringExtra("lastName");
            String email = intent.getStringExtra("email");
            String username = intent.getStringExtra("username");
            String password = intent.getStringExtra("password");

            mTvFirstName.setText(firstName+" "+lastName);
            mTvEmail.setText(email);
            mTvUsername.setText(username);
            mTvPassword.setText(password);*/
        }
    }
}
