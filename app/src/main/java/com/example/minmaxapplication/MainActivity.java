package com.example.minmaxapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calculate(View v){
        EditText e1,e2,e3;
        e1=(EditText) findViewById(R.id.txt_1);
        e2=(EditText) findViewById(R.id.txt_2);
        e3=(EditText) findViewById(R.id.txt_3);
        Intent i=new Intent("act.second");
        i.putExtra("num1",e1.getText().toString());
        i.putExtra("num2",e2.getText().toString());
        i.putExtra("num3",e3.getText().toString());
    }
}