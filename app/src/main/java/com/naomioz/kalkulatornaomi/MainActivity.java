package com.naomioz.kalkulatornaomi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText valueA, valueB;
    Button btnTambah, btnKurang, btnKali, btnBagi;
    TextView textHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valueA = (EditText) findViewById(R.id.valueA);
        valueB = (EditText) findViewById(R.id.valueB);
        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnBagi = (Button) findViewById(R.id.btnBagi);
        textHasil = (TextView) findViewById(R.id.textHasil);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ValueA = Integer.parseInt(valueA.getText().toString());
                int ValueB = Integer.parseInt(valueB.getText().toString());
                int result = ValueA + ValueB;
                textHasil.setText(String.valueOf(result));
            }
        });
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ValueA = Integer.parseInt(valueA.getText().toString());
                int ValueB = Integer.parseInt(valueB.getText().toString());
                int result = ValueA - ValueB;
                textHasil.setText(String.valueOf(result));
            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ValueA = Integer.parseInt(valueA.getText().toString());
                int ValueB = Integer.parseInt(valueB.getText().toString());
                int result = ValueA * ValueB;
                textHasil.setText(String.valueOf(result));
            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ValueA = Integer.parseInt(valueA.getText().toString());
                int ValueB = Integer.parseInt(valueB.getText().toString());
                int result = ValueA / ValueB;
                textHasil.setText(String.valueOf(result));
            }
        });
    }
}