package com.example.registerhomework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText mEditTextFirstName, mEditTextLastName, mEditTextEmail, mEditTextUsername, mEditTextPassword, mEditTextConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mEditTextFirstName = findViewById(R.id.firstName);
        mEditTextLastName = findViewById(R.id.lastName);
        mEditTextEmail = findViewById(R.id.emailAddress);
        mEditTextUsername = findViewById(R.id.username);
        mEditTextPassword = findViewById(R.id.password);
        mEditTextConfirmPassword = findViewById(R.id.confirmPassword);
    }

    public void onRegister(View v)
    {
        String firstName = mEditTextFirstName.getText().toString();
        String lastName = mEditTextLastName.getText().toString();
        String email = mEditTextEmail.getText().toString();
        String username = mEditTextUsername.getText().toString();
        String password = mEditTextPassword.getText().toString();
        String confirmPassword = mEditTextConfirmPassword.getText().toString();

        if(firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty())
        {
            Toast.makeText(this, R.string.signUpEmptyField, Toast.LENGTH_SHORT).show();
        }
        else
        {
            if(password.equals(confirmPassword))
            {
                Intent intent = new Intent(this, MainActivity.class);
                intent.putExtra("firstName", firstName);
                intent.putExtra("lastName", lastName);
                intent.putExtra("email", email);
                intent.putExtra("username", username);
                intent.putExtra("password", password);
                startActivity(intent);
                Toast.makeText(this, R.string.signUpSuccess, Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(this, R.string.signUpNotMatchPassword, Toast.LENGTH_SHORT).show();
            }
        }


    }
}
