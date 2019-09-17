package com.example.student.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    EditText etA,etB,etC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        etA = (EditText) findViewById(R.id.etA);
        etB = (EditText) findViewById(R.id.etB);
        etC = (EditText) findViewById(R.id.etC);
    }
    public void CalculateAndSendResult(View v) {
        float a, b, c, delta;
        String result = "";
        if(etA.getText().toString().trim().length() == 0){
            etA.requestFocus();
            etA.setError("Không được bỏ trống trường này");
        }
        else if(etB.getText().toString().trim().length() == 0){
            etB.requestFocus();
            etB.setError("Không được bỏ trống trường này");
        }
        else if(etC.getText().toString().trim().length() == 0){
            etC.requestFocus();
            etC.setError("Không được bỏ trống trường này");
        }
        else {
            a = Float.parseFloat(etA.getText().toString());
            b = Float.parseFloat(etB.getText().toString());
            c = Float.parseFloat(etC.getText().toString());
            delta = b * b - 4 * a * c;
            if(a == 0)
                result = "Phương trình vô nghiệm";
            else if (delta == 0) {
                result = "Phương trình có nghiệm kép";
            } else if (delta > 0) {
                result = "Phương trình có 2 nghiệm phân biệt";
            } else if (delta < 0) {
                result = "Phương trình vô nghiệm";
            }
            Intent i = new Intent(this, MainActivity.class);
            i.putExtra("result", result);
            setResult(Activity.RESULT_OK, i);
            finish();
        }
    }
}
