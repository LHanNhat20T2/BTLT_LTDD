package com.example.bttonghoplt;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button btnlogin;
    EditText edtUser,edtPass;
    TextView tvsignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnlogin = (Button) findViewById(R.id.buttonLogin);
        edtUser = (EditText) findViewById(R.id.edittextUser);
        edtPass = (EditText) findViewById(R.id.edittextPassword);
        tvsignup = (TextView) findViewById(R.id.textviewsignup);


        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtUser.getText().length()!=0&&edtPass.getText().length()!=0){
                    if(edtUser.getText().toString().equals("hannhat244") &&  edtPass.getText().toString().equals("123")){
                        Intent intent = new Intent(Login.this,Nav_barActivity.class);
                        startActivity(intent);
                        Toast.makeText(Login.this, "Dang nhap thanh cong!!", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(Login.this, "Sai tai  khoan hoac mat khau!!", Toast.LENGTH_SHORT).show();
                        edtUser.setText("");
                        edtPass.setText("");
                    }
                }else{
                    Toast.makeText(Login.this, "Nhap day du thong tin!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        tvsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this, SignUp.class);
                startActivity(i);
            }
        });
    }
}