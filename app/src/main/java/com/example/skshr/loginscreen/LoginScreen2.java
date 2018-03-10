package com.example.skshr.loginscreen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by skshr on 29-01-2018.
 */

public class LoginScreen2 extends AppCompatActivity {

    TextView name;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginscreen2);
        name = (TextView)findViewById(R.id.username);
        name.setText(getIntent().getStringExtra("keyname"));
    }
}
