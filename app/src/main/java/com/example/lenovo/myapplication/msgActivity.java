package com.example.lenovo.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class msgActivity extends Activity{

    private Button grant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.msg_layout);
        grant=(Button)findViewById(R.id.grant);
        grant.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(msgActivity.this,grantActivity.class);
                startActivity(intent);
            }
        });
    }
}
