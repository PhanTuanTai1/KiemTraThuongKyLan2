package com.example.student.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView etResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etResult = (TextView)findViewById(R.id.etResult);
    }
    public void Open(View v){
        Intent i = new Intent(this,Main2Activity.class);
        startActivityForResult(i,1);
        //finish();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 1){
            if(resultCode == Activity.RESULT_OK)
                etResult.setText(data.getStringExtra("result"));
        }
    }
}
