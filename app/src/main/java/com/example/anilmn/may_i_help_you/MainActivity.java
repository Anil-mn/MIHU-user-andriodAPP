package com.example.anilmn.may_i_help_you;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText euse,epass;
    Button blogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        euse=(EditText)findViewById(R.id.etusername);
        epass=(EditText)findViewById(R.id.etpassword);
        blogin=(Button)findViewById(R.id.btnlogin);
      //  altlogin();
    }



}
