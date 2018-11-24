package com.example.lenovo.myapplication;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.lenovo.myapplication.OkHttpUtil.CallBackUtil;
import com.example.lenovo.myapplication.OkHttpUtil.OkHttpUtil;
import okhttp3.Call;
import okhttp3.Response;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends BaseActivity implements OnClickListener {

    public static final int SHOW_RESPONSE = 0;
    private Button login;
    private Button reset;
    private EditText accountEdit;
    private EditText passwordEdit;

//    private Handler handler = new Handler() {
//        @Override
//        public void handleMessage(Message msg) {
//            switch (msg.what) {
//                case SHOW_RESPONSE:
//                     response=(String) msg.obj;
//
//            }
//            if(response.equals("111")){
//                Intent intent = new Intent(MainActivity.this, personActivity.class);
//                startActivity(intent);
//                finish();
//            }else{
//                Toast.makeText(MainActivity.this, "account or password is  invalid", Toast.LENGTH_SHORT).show();
//            }
//        }
//    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        login = (Button) findViewById(R.id.login);
        reset = (Button) findViewById(R.id.reset);
        accountEdit = (EditText) findViewById(R.id.account);
        passwordEdit = (EditText) findViewById(R.id.password);
        login.setOnClickListener(this);
        reset.setOnClickListener(this);
    }

   @Override
    public void onClick(View v) {
        if (v.getId() == R.id.login) {
            String name=accountEdit.getText().toString();
            String pass=passwordEdit.getText().toString();
            HashMap<String,String> jsonmap=new HashMap<>();
            jsonmap.put("account",pass);
            OkHttpUtil.okHttpPost("http://127.0.0.1:8080/sign", jsonmap, new CallBackUtil() {
                @Override
                public Object onParseResponse(Call call, Response response) {
                    return null;
                }

                @Override
                public void onFailure(Call call, Exception e) {
                    Toast.makeText(MainActivity.this, "http fail", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onResponse(Object response) {
                    String res=(String)response;
                     if(res.equals("111")){
                         Intent intent = new Intent(MainActivity.this, personActivity.class);
                         startActivity(intent);
                         finish();
                     }else{
                         Toast.makeText(MainActivity.this, "account or password is  invalid", Toast.LENGTH_SHORT).show();
                     }
                }
            });
        }
        else if(v.getId()==R.id.reset){
            accountEdit.setText(null);
            passwordEdit.setText(null);
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
