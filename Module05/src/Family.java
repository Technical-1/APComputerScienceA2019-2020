import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Purpose: Create a program that can calculate the probability of each family combination
 *
 * @author Jacob Kanfer
 * @version 09/26/2019
 *
 */
public class Family {
    public static void main(String[] args) throws FileNotFoundException {

        //initialize variables
        String token;
        int total = 0;
        int BB = 0;
        int BG = 0;
        int GG = 0;
        double percentageBB;
        double percentageGG;
        double percentageBG;

        //create file and fileScanner
        File fileName = new File("maleFemaleInFamily.txt");
        Scanner inFile = new Scanner(fileName);

        //checking families
        while(inFile.hasNext()) {
            token = inFile.next();
            if(token.equalsIgnoreCase("BB")) {
                BB++;
            } else if(token.equalsIgnoreCase("GG")) {
                GG++;
            } else if(token.equalsIgnoreCase("GB") || token.equalsIgnoreCase("BG")){
                BG++;
            } else {
                return;
            }
            total++;
        }

        //percentage calculation
        percentageBB = ((double) BB/total) * 100.0;
        percentageBB = Math.round(percentageBB * 100.0)/100.0;

        percentageGG = ((double) GG/total) * 100.0;
        percentageGG = Math.round(percentageGG * 100.0)/100.0;

        percentageBG = ((double) BG/total) * 100.0;
        percentageBG = Math.round(percentageBG * 100.0)/100.0;

        //outputs
        inFile.close();
        System.out.println("Composition statistics for famileis with two children");
        System.out.println("\n Total number of families: " + total);
        System.out.println("\n Number of families with");
        System.out.println("\t 2 boys: " + BB + " represents " + percentageBB + "%");
        System.out.println("\t 2 girl: " + GG + " represents " + percentageGG + "%");
        System.out.println("\t 1 boy and 1 girl: "  + BG + " represents " + percentageBG + "%");
    }

}