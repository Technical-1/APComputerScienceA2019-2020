/*
 * This program calculates your TDEE
 *
 * @Jacob Kanfer
 * @9/20/2019
 */
import java.util.Scanner;

public class TDEE {
    public static void main(String[] args) {
        //Declare variables
        Scanner in = new Scanner(System.in);
        String name;
        int bmr;
        String gender;
        String activityLevel;
        double activityFactor = 0;
        double tdee;

        //User input
        System.out.println("What is your name?");
        name = in.nextLine();
        System.out.println("What is your BMR?");
        bmr = in.nextInt();
        System.out.println("What is your gender? (M/F)");
        gender = in.next();
        System.out.println("Select Your Activity Level");
        System.out.println("[A] Resting (Sleeping, reclining)");
        System.out.println("[B] Sedentary (Minimal ovement)");
        System.out.println("[C] Light (Sitting, Standing");
        System.out.println("[D] Moderate (Light Manual Labor, Dancing, Riding Bike");
        System.out.println("[E] Very Active (Team Sports, Hard Manual Labor");
        System.out.println("[F] Extremely Active (Full-time Athlete, Heavy Manual Labor)");

        System.out.println("Enter the letter corresponding to your activity level");
        activityLevel = in.next();

        //Determine TDEE
        if(!(gender.equalsIgnoreCase("M")
                || gender.equalsIgnoreCase("F"))){
            System.out.println("Please select a valid gender");
            return;
        } else if(gender.equalsIgnoreCase("M")) {
            if(activityLevel.equalsIgnoreCase("A")) {
                activityFactor = 1;
            } else if(activityLevel.equalsIgnoreCase("B")) {
                activityFactor = 1.3;
            } else if(activityLevel.equalsIgnoreCase("C")) {
                activityFactor = 1.6;
            } else if(activityLevel.equalsIgnoreCase("D")) {
                activityFactor = 1.7;
            } else if(activityLevel.equalsIgnoreCase("E")) {
                activityFactor = 2.1;
            } else if(activityLevel.equalsIgnoreCase("F")) {
                activityFactor = 2.4;
            } else {
                System.out.println("Please select a valid activity level");
                return;
            }
        } else if(gender.equalsIgnoreCase("F")) {
            if(activityLevel.equalsIgnoreCase("A")) {
                activityFactor = 1;
            } else if(activityLevel.equalsIgnoreCase("B")) {
                activityFactor = 1.3;
            } else if(activityLevel.equalsIgnoreCase("C")) {
                activityFactor = 1.5;
            } else if(activityLevel.equalsIgnoreCase("D")) {
                activityFactor = 1.6;
            } else if(activityLevel.equalsIgnoreCase("E")) {
                activityFactor = 1.9;
            } else if(activityLevel.equalsIgnoreCase("F")) {
                activityFactor = 2.2;
            } else {
                System.out.println("Please select a valid activity level");

            }
        }
        tdee = bmr * activityFactor;
        //User output
        System.out.println("\nYour results:");
        System.out.println("Name: " + name + "\t Gender: " + gender);
        System.out.println("BMR: " + (double)bmr + " calories \tActivity Factor: " + activityFactor);
        System.out.println("TDEE: " + tdee);

    }
}