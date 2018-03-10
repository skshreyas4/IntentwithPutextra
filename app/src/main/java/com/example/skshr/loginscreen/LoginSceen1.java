package com.example.skshr.loginscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by skshr on 29-01-2018.
 */

public class LoginSceen1 extends AppCompatActivity {

    TextView n;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logscreen1);
        n = (TextView)findViewById(R.id.username);
    }
    public  void  button(View v){
        Intent i = new Intent(LoginSceen1.this,LoginScreen2.class);
        i.putExtra("keyname",n.getText().toString());
        startActivity(i);
    }





}
