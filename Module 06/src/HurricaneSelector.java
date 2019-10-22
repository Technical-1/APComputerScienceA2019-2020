/**
 * author: Jacob Kanfer
 * purpose: Write a program to calculate the average category, pressure, and wind speed of Atlantic hurricanes that have occurred between a given year range. Also, tally the number of storms in each category according to the Saffir-Simpson scale.
 * date: 10/21/2019
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class HurricaneSelector {
    public static void main(String[] args) throws IOException {
        //read data from text file & put in an array
        Scanner in = new Scanner(System.in);
        File fileName = new File("HurricaneData.txt");
        Scanner inFile = new Scanner(fileName);
        PrintWriter outFile = new PrintWriter("hurricanesummary.txt");

        //initializse variables (ALOT)
        int cat1 = 0;
        int cat2 = 0;
        int cat3 = 0;
        int cat4 = 0;
        int cat5 = 0;
        int lower;
        int upper;
        int minCat = Integer.MAX_VALUE;
        int maxCat = Integer.MIN_VALUE;
        double aveCat;
        double catSum = 0;
        int total = 0;
        double pressureSum = 0;
        double maxPres = Integer.MIN_VALUE;
        double minPres = Integer.MAX_VALUE;
        double aveWs;
        double avePres;
        double wsSum = 0;
        double maxWs = Integer.MIN_VALUE;
        double minWs = Integer.MAX_VALUE;

        //initialize arrays based on lines counted in text file
        int [] years = new int[156];
        String [] months = new String[156];
        int [] pressures = new int[156];
        double [] windSpeeds = new double[156];
        String [] names = new String[156];

        //read and assign data from text file to the arrays
        int index = 0;
        while(inFile.hasNext() && index < 156){
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeeds[index] = inFile.nextDouble();
            names[index] = inFile.next();
            index++;
        }
        inFile.close();

        //continue program below
        //ask for lower
        System.out.println("Enter the lower value for the year");
        lower = in.nextInt();
        while(!(lower <=2015 && lower >= 1995)) {
            System.out.println("Invalid year. Try again");
            lower = in.nextInt();
        }
        //ask for upper
        System.out.println("Enter the upper value for the year");
        upper = in.nextInt();
        while(!(upper <=2015 && upper >= 1995)) {
            System.out.println("Invalid year. Try again");
            upper = in.nextInt();
        }

        int[] cat = new int[156];
        for(int n = 0; n < windSpeeds.length; n++) {
            windSpeeds[n] = windSpeeds[n] * 1.15078;
        }
            //establish categories
        for(int n = 0; n < windSpeeds.length; n++) {
            if (windSpeeds[n] >= 74 && windSpeeds[n] <= 95) {
                cat[n] = 1;
            } else if (windSpeeds[n] >= 95 && windSpeeds[n] <= 110) {
                cat[n] = 2;
            } else if (windSpeeds[n] >= 111 && windSpeeds[n] <= 129) {
                cat[n] = 3;
            } else if (windSpeeds[n] >= 130 && windSpeeds[n] < 156) {
                cat[n] = 4;
            } else {
                cat[n] = 5;
            }
        }
        //print top
        System.out.printf("%65s\n", "Hurricanes " + lower + " - " + upper);
        System.out.printf("%1s%22s%22s%22s%22s\n", "Year", "Hurricane", "Category", "Pressure (mb)", "Wind speed (mph)");

        //write top to file
        outFile.printf("%65s\n", "Hurricanes " + lower + " - " + upper);
        outFile.printf("%1s%22s%22s%22s%22s\n", "Year", "Hurricane", "Category", "Pressure (mb)", "Wind speed (mph)");

        //main loop
            for(int i = 0; i < years.length; i++) {
                //make sure its in the year range
                if (years[i] >= lower && years[i] <= upper) {
                    //add to all sums
                    catSum += cat[i];
                    pressureSum += pressures[i];
                    wsSum += windSpeeds[i];
                    total++;

                    //add cat values
                    if (windSpeeds[i] >= 74 && windSpeeds[i] <= 95) {
                        cat1++;
                    } else if (windSpeeds[i] >= 95 && windSpeeds[i] <= 110) {
                        cat2++;
                    } else if (windSpeeds[i] >= 111 && windSpeeds[i] <= 129) {
                        cat3++;
                    } else if (windSpeeds[i] >= 130 && windSpeeds[i] < 156) {
                        cat4++;
                    } else {
                        cat5++;
                    }
                    //find min and max wind speeds
                    if (windSpeeds[i] > maxWs) {
                        maxWs = windSpeeds[i];
                    }
                    if (windSpeeds[i] < minWs) {
                        minWs = windSpeeds[i];
                    }
                    //find min and max pressures
                    if (pressures[i] > maxPres) {
                        maxPres = pressures[i];
                    }

                    if (pressures[i] < minPres) {
                        minPres = pressures[i];
                    }

                    //find min and max cats
                    if (cat[i] > maxCat) {
                        maxCat = cat[i];
                    }

                    if (cat[i] < minCat) {
                        minCat = cat[i];
                    }

                    //print out all data and write
                    System.out.printf("%-10s%-19s%15s%20s%15s%10.2f\n", years[i], names[i], cat[i], pressures[i], "", windSpeeds[i]);
                    outFile.printf("%-10s%-19s%15s%20s%15s%10.2f\n", years[i], names[i], cat[i], pressures[i], "", windSpeeds[i]);
                }
            }
            //calculate averages
        aveCat = catSum/total;
        avePres = pressureSum/total;
        aveWs = wsSum/total;
        System.out.println("========================================================================================");
        outFile.println("========================================================================================");
        //print and write average/min/max values
        System.out.printf("%43s%1.1f%15s%4.1f%13s%10.2f\n", "Average: ", aveCat, "", avePres, "", aveWs);
        System.out.printf("%43s%1s%17s%1s%18s%3.2f\n", "Minimum: ", minCat, "", minPres, "", minWs);
        System.out.printf("%43s%1s%16s%1s%17s%3.2f\n", "Maximum: ", maxCat, "", maxPres, "", maxWs);

        outFile.printf("%43s%1.1f%15s%4.1f%13s%10.2f\n", "Average: ", aveCat, "", avePres, "", aveWs);
        outFile.printf("%43s%1s%17s%1s%18s%3.2f\n", "Minimum: ", minCat, "", minPres, "", minWs);
        outFile.printf("%43s%1s%16s%1s%17s%3.2f\n", "Maximum: ", maxCat, "", maxPres, "", maxWs);

        //print and write summary of cats
        System.out.println("Summary of Categories:");
        System.out.printf("%-5s\n", "Cat 1: " + cat1);
        System.out.printf("%-5s\n", "Cat 2: " + cat2);
        System.out.printf("%-5s\n", "Cat 3: " + cat3);
        System.out.printf("%-5s\n", "Cat 4: " + cat4);
        System.out.printf("%-5s\n", "Cat 5: " + cat5);

        outFile.println("Summary of Categories:");
        outFile.printf("%-5s\n", "Cat 1: " + cat1);
        outFile.printf("%-5s\n", "Cat 2: " + cat2);
        outFile.printf("%-5s\n", "Cat 3: " + cat3);
        outFile.printf("%-5s\n", "Cat 4: " + cat4);
        outFile.printf("%-5s\n", "Cat 5: " + cat5);

    outFile.close();
    }
}


