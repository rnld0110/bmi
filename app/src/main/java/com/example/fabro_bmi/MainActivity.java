package com.example.fabro_bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText  name,weight, height;
    TextView resultText;
    String calculation, BMIresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.name);
        weight= findViewById(R.id.weight);
        height= findViewById(R.id.height);
        resultText= findViewById(R.id.result);


    }

    public void calculatebmi(View view) {

        String S1= name.getText().toString();
        String S2= weight.getText().toString();
        String S3= height.getText().toString();

        name.setText("Gwapo"+ S1);
        float weightValue= Float.parseFloat(S2);
        float heigthValue= Float.parseFloat(S3);

        float bmi= weightValue / (heigthValue * heigthValue);

        if (bmi < 16) {
            BMIresult= "Severly Under Weight";
        }else if (bmi < 18.5){
            BMIresult="Under Weigth";
        }else  if (bmi >= 18.5 && bmi <= 24.9){
            BMIresult="Normal";
        }else if (bmi >= 25 && bmi <= 29.9){
            BMIresult="Over weight";
        }else {
            BMIresult="Obese";
        }

       

        calculation = "Result:\n"+ S1 +"\n" + bmi + "\n" + BMIresult;

        resultText.setText(calculation);

    }
}