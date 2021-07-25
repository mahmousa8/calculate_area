package com.example.area;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.Math;


public class Main2Activity extends AppCompatActivity {

    EditText d1;
    EditText d2;
    EditText d3;
    TextView cons_sh;
    TextView showPlus;
    TextView currentPlusPrevious;
    double area;
    double Previouspluscurrent;
    calculate calculate;
    String result1;
    String a1;
    String b1;
    String c1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        calculate = new calculate(this);
       d1 = (EditText) findViewById(R.id.d1);
       d2 = (EditText) findViewById(R.id.d2);
       d3 = (EditText) findViewById(R.id.d3);
       cons_sh = (TextView) findViewById(R.id.show);
       showPlus = (TextView) findViewById(R.id.showPlus);
       currentPlusPrevious = (TextView) findViewById(R.id.currentPlusPrevious);
    }



    public void clear(View view) {
        d1 = (EditText) findViewById(R.id.d1);
        d2 = (EditText) findViewById(R.id.d2);
        d3 = (EditText) findViewById(R.id.d3);
        d1.setText("");
       d2.setText("");
        d3.setText("");
        cons_sh.setText("");
        showPlus.setText("");
        area =0;
        Previouspluscurrent= 0;
        calculate = new calculate(this);
        currentPlusPrevious.setVisibility(View.INVISIBLE);

    }

   public void calc(View view) {

       a1 = d1.getText().toString();
       b1 = d2.getText().toString();
       c1 = d3.getText().toString();
       result1 = calculate.areaCalculation(a1,b1,c1);
       currentPlusPrevious.setVisibility(View.VISIBLE);
       String s1 = result1.replaceAll("[^0-9?!\\.]","");
        cons_sh.setText(result1 + "\n");
       Previouspluscurrent = Previouspluscurrent + Double.parseDouble(s1);
        cons_sh.append(calculate.fadanCalculation(String.valueOf(Double.parseDouble(s1))));

        showPlus.setText(getText(R.string.area) +" = "+ Previouspluscurrent + "\n");
       showPlus.append(calculate.fadanCalculation(String.valueOf(Previouspluscurrent)));


    }



}
