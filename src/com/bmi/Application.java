package com.bmi;

public class Application {
    public static void main (String [] args){
        Calculator calcBMI = new Calculator();

        if (calcBMI.heightM > 0 && calcBMI.heightM < 3 && calcBMI.weightKG > 0 && calcBMI.weightKG < 300){
            System.out.println("Result: " + calcBMI.bmi);
        } else {
            System.out.println("Not valid");
        }

    }
}
