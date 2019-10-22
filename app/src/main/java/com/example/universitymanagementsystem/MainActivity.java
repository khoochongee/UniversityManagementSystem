package com.example.universitymanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnLogin;
    private TextView edtUsername,edtPassword;
    String username="khoochongee";
    String password="khoochongee1255";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin=findViewById(R.id.btn_login);
        edtUsername=findViewById(R.id.edt_username);
        edtPassword=findViewById(R.id.edt_password);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtUsername.getText().toString().equals(username)&&edtPassword.getText().toString().equals(password)){
                    Toast.makeText(MainActivity.this,"Login Successfully",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, LoggedIn.class);
                    startActivity(i);
                    finish();
                }else{
                    Toast.makeText(MainActivity.this,"Login Failed, please try again.",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

