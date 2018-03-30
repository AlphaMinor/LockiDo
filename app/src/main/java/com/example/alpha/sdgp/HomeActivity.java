package com.example.alpha.sdgp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    private Button btnManageUsers;
    private Button btnLocation;
    private Button btnActivityLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnManageUsers = (Button)findViewById(R.id.btnSignUp);
        btnManageUsers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openUsersActivity();
            }
        });


        btnLocation = (Button)findViewById(R.id.btnSignIn);
        btnLocation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openLocationActivity();
            }
        });

        btnActivityLog = (Button)findViewById(R.id.btnSignIn);
        btnActivityLog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openActivityLog();
            }
        });

    }



    public void openUsersActivity(){
        Intent registration = new Intent(this,UserRegistrationActivity.class);
        startActivity(registration);
    }

    public void openLocationActivity(){
        Intent home = new Intent(this,HomeActivity.class);
        startActivity(home);
    }

    public void openActivityLog(){
        Intent home = new Intent(this,HomeActivity.class);
        startActivity(home);
    }
}
