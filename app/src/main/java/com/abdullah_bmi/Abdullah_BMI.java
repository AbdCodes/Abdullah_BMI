package com.abdullah_bmi;

public class Abdullah_BMI {
    private double height,weight;

    public Abdullah_BMI(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double calcBMI()
    {

        double BMI = (weight/height/height)*10000;
        return BMI;


    }
}
