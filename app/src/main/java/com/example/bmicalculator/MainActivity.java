package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText weight,height;
    TextView resulttext;
    String calculation,bmiresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight = findViewById(R.id.weight);
        height= findViewById(R.id.height);
        resulttext= findViewById(R.id.result);
    }
   public void calculate(View view)
   {
       String s1=weight.getText().toString();
       String s2=height.getText().toString();
       float weightview=Float.parseFloat(s1);
       float heightview=Float.parseFloat(s2)/100;

       float bmi=weightview/(heightview*heightview);

       if(bmi<16)
       {
           bmiresult="SEVERLY UNDER WEIGHT";
       }
       else if((bmi>=16)&&(bmi<18.5))
               bmiresult="UNDER WEIGHT";
       else if((bmi>=18.5)&&(bmi<=24.9))
           bmiresult="NORMAL WEIGHT";
       else if((bmi>=25)&&(bmi<=29.9))
           bmiresult="OVER WEIGHT";
       else if(bmi>=30)
            bmiresult="EXTREMLY OVER WEIGHT";

       calculation="Result  \n\n"+bmi+"\n"+bmiresult;
       resulttext.setText(calculation);
   }
}
