package com.example.area;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    EditText d1;
    EditText d2;
    EditText d3;
    TextView d4;
    calculate calculate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        d1 = (EditText) findViewById(R.id.sahm);
        d2 = (EditText) findViewById(R.id.karat);
        d3 = (EditText) findViewById(R.id.fadan);
        d4 = (TextView) findViewById(R.id.showInfo);
        calculate = new calculate(this);

    }


    public void calcul(View view) {


        String s = d1.getText().toString();
        String k = d2.getText().toString();
        String f = d3.getText().toString();

        d4.setText(calculate.meterCalculation(s,k,f));


    }

    public void clear(View view) {
        d1.setText("");
        d2.setText("");
        d3.setText("");
        d4.setText("");
        calculate = new calculate(this);
    }
}
