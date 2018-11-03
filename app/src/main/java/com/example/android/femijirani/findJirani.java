package com.example.android.femijirani;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class findJirani extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_jirani);

//Calls the "Display Jirani" Activity
        Button buttondisplayJirani = (Button) findViewById(R.id.displayJirani);
        buttondisplayJirani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDisplayJirani();
            }
        });
    }

//Function for finding a jirani
    public void openDisplayJirani(){
        Intent intent = new Intent(this, displayActivity.class);
        startActivity(intent);
    }
    @Override
    public void onClick(View v) {

    }
}
