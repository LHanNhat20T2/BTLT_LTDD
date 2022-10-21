package com.example.bttonghoplt;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MoTa extends AppCompatActivity {
    private Boolean btnback = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mo_ta);
        Button btnorder = (Button) findViewById(R.id.btn_order);
        Button btnback = (Button) findViewById(R.id.btn_backorder);
        TextView tv1 = (TextView) findViewById(R.id.txtten_mota);
        TextView tv2 = (TextView) findViewById(R.id.txt_mota);
        TextView tv3 = (TextView) findViewById(R.id.txtgia_mota);
        ImageView img4 = (ImageView) findViewById(R.id.img_mota);

        Intent intent= getIntent();
        img4.setImageResource(intent.getIntExtra("anh",0));
        tv1.setText(intent.getStringExtra("ten"));
        tv2.setText(intent.getStringExtra("mota"));
        tv3.setText(intent.getStringExtra("gia"));


        final DialogInterface.OnClickListener dialogClickListeners = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case DialogInterface.BUTTON_POSITIVE:
                        finish();
                        break;
                    case DialogInterface.BUTTON_NEGATIVE:

                        break;
                }
            }
        };
        btnback.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                                AlertDialog.Builder builde = new AlertDialog.Builder(MoTa.this);
                builde.setMessage(
                                "Bạn có muốn quay lại không?")
                        .setPositiveButton("Yes ", dialogClickListeners)
                        .setNegativeButton("Cancel", dialogClickListeners).show();
                                Intent intent = new Intent(getApplicationContext(), HorseFragment.class);
            }
        });

        btnorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MoTa.this, "Đặt hàng thành công", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

