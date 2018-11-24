package com.example.lenovo.myapplication;

import android.os.Bundle;

import android.app.Activity;

import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class checkActivity extends Activity{
    private Button check;
    private EditText address;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.check_layout);
        check = (Button) findViewById(R.id.check);
        address= (EditText) findViewById(R.id.address);
        check.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        address.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}