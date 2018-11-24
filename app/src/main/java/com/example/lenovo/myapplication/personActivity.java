package com.example.lenovo.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class personActivity extends Activity {

    private Button MessageCenter;
    private Button check;
    private Button revoke;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.person_layout);
        MessageCenter=(Button)findViewById(R.id.MessageCenter);
        check=(Button)findViewById(R.id.check);
        revoke=(Button)findViewById(R.id.revoke);
        MessageCenter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //添加逻辑
                Intent intent = new Intent(personActivity.this,msgActivity.class);
                startActivity(intent);
            }
        });
        check.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //添加逻辑
                Intent intent = new Intent(personActivity.this,checkActivity.class);
                startActivity(intent);
            }
        });
        revoke.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //添加逻辑
                Intent intent = new Intent(personActivity.this,revokeActivity.class);
                startActivity(intent);
            }
        });

    }


}

