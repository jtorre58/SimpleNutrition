package com.example.jtorr.simplenutrition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private SimpleNutrition simpleNutrition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Calculates BMI
    public void calculate(View v){
        EditText weightEdit = (EditText) findViewById(R.id.weight);
        EditText ageEdit = (EditText) findViewById(R.id.age);
        EditText genderEdit = (EditText) findViewById(R.id.gender);
        EditText feetEdit = (EditText) findViewById(R.id.feet);
        EditText inchesEdit = (EditText) findViewById(R.id.inches);


        String weightStr = weightEdit.getText().toString();
        String ageStr = ageEdit.getText().toString();
        String genderStr = genderEdit.getText().toString();
        String feetStr = feetEdit.getText().toString();
        String inchesStr = inchesEdit.getText().toString();

        try{
            double weight = Double.parseDouble(weightStr);
            int age = Integer.parseInt(ageStr);
            int feet = Integer.parseInt(feetStr);
            int inches = Integer.parseInt(inchesStr);

            simpleNutrition.setWeight(weight);
            simpleNutrition.setAge(age);
            simpleNutrition.setGender(genderStr);
            simpleNutrition.setFeet(feet);
            simpleNutrition.setInches(inches);


        }
        catch (NumberFormatException e){

        }
    }
}
