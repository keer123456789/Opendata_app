package com.example.lenovo.myapplication;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class grantActivity extends Activity {
    private Button yes;
    private Button no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.grant_layout);
        yes=(Button)findViewById(R.id.yes);
        no=(Button)findViewById(R.id.no) ;
        yes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //添加逻辑
            }
        });
        no.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

            }
        });
    }

}
