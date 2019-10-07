/*
 * Purpose: Write a program that uses the Monte Carlo sampling method to estimate the average number of animals observed before spotting one you are tracking within a particular ecosystem.
 *
 * @author Jacob Kanfer
 * @version 10/3/2019
 *
 */

/* Pseudocode:
    For trials: Create a random variable
                Create a PrintWriter
                Ask for how many trials (ask again while var ! >= 1000)
                Create a for loop for the amount of trials
                Create a counter variable, value for your animal, random value for animalSpotted
                While animal spotted isnt my animal, add to counter and reset value for animal
                Counter++ after while loop to take into account OUR animal
                Print the counter to the textFile
     For Part 2: Create a scanner to scan myFile
                 Create a sum variable
                 while file has a next value, add the nextInt to sum
                 Calculate average by using sum/trial number

 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class AnimalPopulation {
    public static void main(String[] args) throws FileNotFoundException {

        //declare scanners, random, and printwriter
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        File myFile = new File("animalPopulation.txt");
        PrintWriter outFile = new PrintWriter(myFile);
        Scanner inFile = new Scanner(myFile);

        //user input
        System.out.println("Welcome to the Manta Ray Simulator");
        System.out.println("How many trials should be simulated?");
        int trials = in.nextInt();

        //check to see correct trial number
        while (trials < 1000) {
            System.out.println("Please enter a number greater than 1000");
            System.out.println("How many trials should be simulated?");
            trials = in.nextInt();
        }

        //experiment
        for (int trialsCompleted = 1; trialsCompleted <= trials; trialsCompleted++) {
            int counter = 0;
            int animalSpotted = random.nextInt(10);
            int mantaRay = 6;

            while(animalSpotted != mantaRay) {
                counter++;
                animalSpotted = random.nextInt(10);
            }
            counter++;
            outFile.println(counter);
        }
            outFile.close();
        //end of experiment

        //calculate averages
        int sum = 0;
        while(inFile.hasNext()) {
                sum += inFile.nextInt();
            }
        inFile.close();

        double average = (double) sum/trials;

        //user output
        System.out.println("The results!");
        System.out.println("The average number of animals observed until spotting a manta ray is: " + average);
        }
    }
