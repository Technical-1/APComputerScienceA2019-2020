/**
 * author: Jacob Kanfer
 * date: 11/8/2019
 * purpose: Write a program that calculates your weight on each planet in the solar system
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PlanetWeight {
    public static void main(String[] args) throws FileNotFoundException {
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

        File fileName = new File("planetgravity.txt");
        Scanner inFile = new Scanner(fileName);
        Scanner in = new Scanner(System.in);
        //create gravity array
        double[] gravity = new double[planets.length];

       for(int i = 0; i < planets.length; i++) {
           gravity[i] = inFile.nextDouble();
       }
        inFile.close();

        //input for weight
        System.out.println("What is your weight in lbs?");
        double yourWeight = in.nextInt();

        //OUTPUT
        System.out.printf("%20s\n", "My Weight on Planets");
        System.out.printf("%1s%20s%25s\n", "Planet", "Gravity", "Weight (lbs)");
        System.out.println("**************************************************************");
        for(int i = 0; i < planets.length; i++) {
            tablePrint(planets[i], gravity[i], weight(humanMass(yourWeight, gravity[i]), gravity[i]));
        }
    }

    //calculate the mass of the human
    private static double humanMass(double yourWeight, double gravity) {
        return ((yourWeight) * (453.59237)) / (9.8/9.8);
    }

    //calc weight on different planets
    private static double weight(double mass, double surfaceGrav) {
        return ((mass) * (surfaceGrav / 9.8)) / 453.59237;
    }

    //print the table
    private static void tablePrint(String planet, double grav, double weight) {
        System.out.printf("%1s   %2.2f   %6.2f   \n", planet, grav, weight);
    }
}
