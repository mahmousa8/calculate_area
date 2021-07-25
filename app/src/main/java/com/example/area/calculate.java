package com.example.area;

import android.content.Context;
import android.widget.Toast;

import java.math.BigDecimal;

public class calculate {

    private Context context;

    float a;
    float b;
    float c;
    float s;
    double rounded;
    double round;

    public calculate(Context ctx) {
        context = ctx;
    }

    String areaCalculation(String a1,String b1,String c1){

        double area;


        if (a1.matches("") || b1.matches("") || c1.matches("")){
            Toast.makeText(context,R.string.not_value_found,Toast.LENGTH_SHORT).show();

        }else {
            a = Float.parseFloat(a1);
            b = Float.parseFloat(b1);
            c = Float.parseFloat(c1);

            if (a+b<=c || b+c<=a || a+c<=b){
                Toast.makeText(context,R.string.invailed_triangle ,Toast.LENGTH_SHORT).show();
            }else{
                s = (a + b + c)/2;
                area =  Math.sqrt((s)*(s-a)*(s-b)*(s-c));
                rounded = Math.round(area*1000);
                round = rounded/1000;
            }
        }

        return (context.getString(R.string.area)+ " = "+ round);

    }

    String fadanCalculation(String Area){

        int f=0;
        int k=0;
        int s=0;
        double m = 0.0;
        double Srounded = 0.0;

        if (Area.matches("")){
            Toast.makeText(context,R.string.not_value_found,Toast.LENGTH_SHORT).show();
        }else {


            double a = Double.parseDouble(Area);
            while (a >= 4200.72) {
                f += 1;
                a -= 4200.72;
            }
            while (a >= 175.03) {
                k += 1;
                a -= 175.03;
            }
            while (a>=7.2929){
            s +=1;
            a -=7.2929;}

            m = a;

           m = BigDecimal.valueOf(m).setScale(2,BigDecimal.ROUND_HALF_DOWN).doubleValue();
        }




        return (context.getString(R.string.fadan)+" = "+f +"\n"+
                context.getString(R.string.karat)+" = "+k+"\n" +
                context.getString(R.string.sahm)+" = "+ s + "\n"+
                context.getString(R.string.meter)+" = "+ m);
    }

    String meterCalculation(String s,String k,String f){

        double Area=0.0;

        if(s.matches("") && k.matches("") && f.matches("")){
            Toast.makeText(context,R.string.not_value_found,Toast.LENGTH_SHORT).show();
        }else{

        if(s.matches("")){
            s="0";
        }
        if(k.matches("")){
            k="0";
        }
        if(f.matches("")){
            f="0";
        }
        double s1 = Double.parseDouble(s);
        double k1 = Double.parseDouble(k);
        double f1 = Double.parseDouble(f);

        Area = (f1 * 4200.72) + (k1 * 175.03) + (s1 * 7.29);
        }

        return (context.getString(R.string.area) + " = " + Area);



    }


}
