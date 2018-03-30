package com.example.alpha.sdgp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button btnSignUp;
    private Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnSignUp = (Button)findViewById(R.id.btnSignUp);
        btnSignUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openUserRegistrationActivity();
            }
        });


        btnSignIn = (Button)findViewById(R.id.btnSignIn);
        btnSignIn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openHomeActivity();
            }
        });

    }



    public void openUserRegistrationActivity(){
        Intent registration = new Intent(this,UserRegistrationActivity.class);
        startActivity(registration);
    }

    public void openHomeActivity(){
        Intent home = new Intent(this,HomeActivity.class);
        startActivity(home);
    }

    public void loginUser(View view){
        EditText username = (EditText) findViewById(R.id.username);
        EditText password = (EditText) findViewById(R.id.password);

        String strUsername = username.getText().toString();
        String strPassword = password.getText().toString();

        //Display an error message if any of the fields are empty
        if(TextUtils.isEmpty(strUsername) || TextUtils.isEmpty(strPassword)){
            Toast.makeText(this, "Fill all the fields to proceed", Toast.LENGTH_LONG).show();
        }

    }
}
