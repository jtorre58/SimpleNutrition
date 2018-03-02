package com.example.jtorr.simplenutrition;

/**
 * Created by jtorr on 2/21/2018.
 */

public class SimpleNutrition{
    String name = "";
    int age = 0;
    int feet = 0;
    int inches = 0;
    double weight = 0.0;
    String gender;

    public SimpleNutrition(String newN, int newA, int newF, int newI, double newW, String newG){
        setName(newN);
        setAge(newA);
        setFeet(newF);
        setInches(newI);
        setWeight(newW);
        setGender(newG);
    }
    public void setName(String n){
        if(n != ""){
            name =n;
        }
    }
    public void setAge(int a){
        if(a > 0){
            age = a;
        }
    }
    public void setFeet(int f){
        if(f != 0){
            feet = f;
        }
    }
    public void setInches(int i){
        inches = i;
    }
    public void setWeight(double w){
        if (w > 0){
            weight = w;
        }
    }
    public void setGender(String g){
        if (g == "M"){
            gender = g;
        }
        else if(g == "F"){
            gender = g;
        }
        else{
            gender = "M";
        }

    }
    //Calculates BMi
    public double caclBmi(int age, String g, double weight, int feet,int inches){
        if (g == "M"){

        }
        else if(g == "F"){
            gender = g;
        }
        return 10.0;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getFeet(){
        return feet;
    }
    public int getInches(){
        return inches;
    }
    public double getWeight(){
        return weight;
    }
}
