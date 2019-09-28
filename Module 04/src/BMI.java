/*
 * This program calculates your bmi 
 *
 * @Jacob Kanfer
 * @9/19/2019
 */

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        //declare variables and scanner
        String name;
        String weightLbs;
        String feet;
        String inches;
        String category;

        Scanner in = new Scanner(System.in);

        //User input
        System.out.println("What is your name?");
        name = in.nextLine();

        System.out.println("What is your weight in pounds?");
        weightLbs = in.nextLine();

        System.out.println("What is your height in feet and inches?");
        feet = in.next();
        inches = in.next();
        //Convert lbs to kg
        int weightLbsInt = Integer.parseInt(weightLbs);
        double weightKg = weightLbsInt * 0.453592;
        weightKg = Math.round(weightKg * 10.0) / 10.0;

        int feetInt = Integer.parseInt(feet);
        int inchesInt = Integer.parseInt(inches);

        double heightM = (inchesInt * 0.0254) + (feetInt * 0.3048);
        heightM = Math.round(heightM * 10.0)/10.0;

        //Bmi formula
        double bmi = (weightKg/(heightM * heightM));
        bmi = Math.round(bmi * 10.0)/10.0;

        //determine category
        if(bmi < 18.5) {
            category = "Underweight";
        } else if(bmi >= 18.5 && bmi <= 24.9) {
            category = "Normal or Healthy Weight";
        } else if (bmi >= 25.0 && bmi <= 25.9) {
            category = "Overweight";
        } else {
            category = "Obese";
        }

        //User output
        System.out.println("Body Mass Index Calculator");
        System.out.println("==========================");
        System.out.println("Name: " + name);
        System.out.println("Height (m): " + heightM);
        System.out.println("Weight (kg):" + weightKg);
        System.out.println("BMI: " + bmi);
        System.out.println("Category: " + category);

    }
}