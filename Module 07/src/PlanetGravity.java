/**
 * author: Jacob Kanfer
 * date: 11/6/2019
 * purpose: Write a program to determine the surface gravity (g) on each planet in our solar system
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PlanetGravity {

    private static File fileName = new File("planetgravity.txt");
    private static PrintWriter pw;

    public static void main(String[] args) throws FileNotFoundException {

        pw = new PrintWriter(fileName);

        //create arrays
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        double diameter[] = {4880, 12103.6, 12756.3, 6794, 142984, 120536, 51118, 49532};
        double mass[] = {3.30e23, 4.869e24, 5.972e24, 6.4219e23, 1.900e27, 5.68e26, 8.683e25, 1.0247e26};
        System.out.printf("%20s\n", "Planetary Data");
        System.out.printf("%1s%20s%15s%15s\n", "Planet", "Diameter (km)", "Mass (kg)", "g (m/s^2)");
        System.out.println("**************************************************************");
        for(int i = 0; i < planets.length; i++) {
            tablePrint(planets[i], diameter[i], mass[i], surfaceGravity(diameter[i], mass[i]));
            textWriter(surfaceGravity(diameter[i], mass[i]));
        }
        pw.close();
    }


    //calculate surface area
    private static double surfaceGravity(double dia, double mass) {
        double planetRadius = (dia * 1000) / 2;
        return ((6.67e-11) * (mass)) / (Math.pow(planetRadius, 2));
    }

    //print the table
    private static void tablePrint(String planet, double dia, double mass, double surfaceGravity) {
        System.out.printf("%1s   %10.0f   %20.2E   %10.2f   \n", planet, dia, mass, surfaceGravity);
    }


    private static void textWriter(double surfaceGrav) throws FileNotFoundException {
        pw.printf("%f \n", surfaceGrav);
    }
}

