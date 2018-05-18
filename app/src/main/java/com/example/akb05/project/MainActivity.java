package com.example.akb05.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_id, et_pw, et_pw_chk;
    String sId, sPw, sPw_chk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        et_id=(EditText)findViewById(R.id.et_Id);
        et_pw=(EditText)findViewById(R.id.et_Password);
        et_pw_chk=(EditText)findViewById(R.id.et_Password_chk);
*/
    }
}
