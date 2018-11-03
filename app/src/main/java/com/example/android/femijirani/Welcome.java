package com.example.android.femijirani;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

//Calls the "Find Jirani" Activity
        Button buttonFindJirani = (Button) findViewById(R.id.find_jirani);
        buttonFindJirani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFindJirani();
            }
        });
//Calls the "Register Jirani" Activity
        Button buttonRegisterJirani = (Button) findViewById(R.id.register_jirani);
        buttonRegisterJirani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegisterJirani();
            }
        });

    }

//Function for finding a jirani
    public void openFindJirani(){
        Intent intent = new Intent(this, findJirani.class);
        startActivity(intent);
    }

//Function for registering a jirani

    public void openRegisterJirani(){
        Intent intent = new Intent(this, registerJirani.class);
        startActivity(intent);
    }
    @Override
    public void onClick(View v) {

    }
}
