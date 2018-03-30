package com.example.alpha.sdgp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class UserRegistrationActivity extends AppCompatActivity {


    FirebaseDatabase database;
    DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registration);
        database = FirebaseDatabase.getInstance();
    }


    public void registerUser(View view) {
        EditText username = (EditText) findViewById(R.id.username);
        EditText e_mail = (EditText) findViewById(R.id.e_mail);
        EditText password = (EditText) findViewById(R.id.password);
        EditText confirmPassword = (EditText) findViewById(R.id.confirmedPassword);

        String child = username.getText().toString();
        myRef = database.getReference("Users").child(child);

        myRef.child("Username").setValue(username.getText().toString());
        myRef.child("E-mail").setValue(e_mail.getText().toString());
        myRef.child("Password").setValue(password.getText().toString());
    }
}
