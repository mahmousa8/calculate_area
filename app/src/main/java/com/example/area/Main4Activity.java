package com.example.area;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Main4Activity extends AppCompatActivity {

    calculate calculate;
    EditText get_area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        calculate = new calculate(this);
        get_area = (EditText) findViewById(R.id.get_area);
    }

    public void clear(View view) {
        EditText d1 = (EditText) findViewById(R.id.get_area);
        d1.setText("");
    }

    public void calculate(View view) {


    TextView sh = (TextView) findViewById(R.id.showinfo);
    String a1 = get_area.getText().toString();

    sh.setText(calculate.fadanCalculation(a1));


    }


    public void imp(View view) {
        EditText get_area = (EditText) findViewById(R.id.get_area);
        Bundle imp = getIntent().getExtras();
        if(imp == null){
            Toast.makeText(this,R.string.not_value_found,Toast.LENGTH_SHORT).show();
            return;
        }
        double area = imp.getDouble("area");
        String area1 = String.valueOf(area);
        get_area.setText(area1);
    }
}
