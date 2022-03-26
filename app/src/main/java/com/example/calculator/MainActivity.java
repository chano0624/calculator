package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);
        setTitle("초간단계산기");

        Button btnAdd,btnSub,btnMul,btnDiv,btnR;
        EditText edit1,edit2;
        TextView textview;
        final String[] num1 = new String[1];
        final String[] num2 = new String[1];
        final Double[] result = new Double[1];

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnR = (Button) findViewById(R.id.btnR);
        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);
        textview = (TextView) findViewById(R.id.textView);

        btnAdd.setBackgroundColor(Color.LTGRAY);
        btnSub.setBackgroundColor(Color.LTGRAY);
        btnMul.setBackgroundColor(Color.LTGRAY);
        btnDiv.setBackgroundColor(Color.LTGRAY);
        btnR.setBackgroundColor(Color.LTGRAY);

        btnAdd.setTextColor(Color.BLACK);
        btnSub.setTextColor(Color.BLACK);
        btnMul.setTextColor(Color.BLACK);
        btnDiv.setTextColor(Color.BLACK);
        btnR.setTextColor(Color.BLACK);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1[0] = edit1.getText().toString();
                num2[0] = edit2.getText().toString();
                if (num1[0].trim().equals("") || num2[0].trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력 값이 없습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    result[0] = Double.parseDouble(num1[0]) + Double.parseDouble(num2[0]);
                    textview.setText("계산 결과: " + result[0].toString());
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1[0] = edit1.getText().toString();
                num2[0] = edit2.getText().toString();
                if (num1[0].trim().equals("") || num2[0].trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력 값이 없습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    result[0] = Double.parseDouble(num1[0]) - Double.parseDouble(num2[0]);
                    textview.setText("계산 결과: " + result[0].toString());
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1[0] = edit1.getText().toString();
                num2[0] = edit2.getText().toString();
                if (num1[0].trim().equals("") || num2[0].trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력 값이 없습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    result[0] = Double.parseDouble(num1[0]) * Double.parseDouble(num2[0]);
                    textview.setText("계산 결과: " + result[0].toString());
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1[0] = edit1.getText().toString();
                num2[0] = edit2.getText().toString();
                if (num2[0].trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    result[0] = Double.parseDouble(num1[0]) / Double.parseDouble(num2[0]);
                    textview.setText("계산 결과: " + result[0].toString());
                }
            }
        });

        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1[0] = edit1.getText().toString();
                num2[0] = edit2.getText().toString();
                if (num2[0].trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    result[0] = Double.parseDouble(num1[0]) % Double.parseDouble(num2[0]);
                    textview.setText("계산 결과: " + result[0].toString());
                }
            }
        });


    }
}