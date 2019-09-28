/*
 * This program calculates the grade averages of your test scores
 *
 * @Jacob Kanfer
 * @8/20/2019
 */

import java.util.Scanner;

public class GradesV3
{
    public static void main(String[] args) {
        //local variables
        int numTests = 0;      //counts number of tests
        int testGrade = 0;     //individual test grade
        int totalPoints = 0;   //total points for all tests
        double average = 0.0;  //average grade

        //Create Scanner
        Scanner in = new Scanner(System.in);

        //Input Variables
        System.out.println("What is your name?");
        String name = in.nextLine();
        System.out.println("What class is this for?");
        String subject = in.nextLine();

        System.out.println("What did you get on the first test?");
        int test1 = in.nextInt();
        System.out.println("What did you get on the second test?");
        int test2 = in.nextInt();
        System.out.println("What did you get on the third test?");
        int test3 = in.nextInt();

        System.out.println("------------------------------------------------------------");
        System.out.println("----------------------- Grade Report -----------------------");
        //Grade of test 1
        testGrade = test1;
        numTests++;
        totalPoints += testGrade;
        average = (double) totalPoints/numTests;
        System.out.print("Test # " + numTests + " Test Grade: " + testGrade +  "    Total Points: " + totalPoints);
        System.out.println("    Average Score: " + average);
        System.out.println();

        //Grade of test 2
        testGrade = test2;
        numTests++;
        totalPoints += testGrade;
        average = (double) totalPoints/numTests;
        System.out.print("Test # " + numTests + " Test Grade: " + testGrade +  "    Total Points: " + totalPoints);
        System.out.println("    Average Score: " + average);
        System.out.println();

        //Grade of test 3
        testGrade = test3;
        numTests++;
        totalPoints += testGrade;
        average = (double) totalPoints/numTests;
        System.out.print("Test # " + numTests + " Test Grade: " + testGrade +  "    Total Points: " + totalPoints);
        System.out.println("    Average Score: " + average);
        System.out.println();

        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");
    /* OLD CODE FOR PREVIOUS ASSIGNMENT NOT NEEDED
     //Grade of test 4
    testGrade = 82;
    numTests++; 
    totalPoints += testGrade;
    average = (double) totalPoints/numTests;
    System.out.print("Test # " + numTests + " Test Grade: " + testGrade +  "    Total Points: " + totalPoints);
    System.out.println("    Average Score: " + average);
    System.out.println();
    
    //Grade of test 5
    testGrade = 100;
    numTests++; 
    totalPoints += testGrade;
    average = (double) totalPoints/numTests;
    System.out.print("Test # " + numTests + " Test Grade: " + testGrade +  "    Total Points: " + totalPoints);
    System.out.println("    Average Score: " + average);
    System.out.println();
    
     //Grade of test 6
    testGrade = 88;
    numTests++; 
    totalPoints += testGrade;
    average = (double) totalPoints/numTests;
    System.out.print("Test # " + numTests + " Test Grade: " + testGrade +  "    Total Points: " + totalPoints);
    System.out.println("    Average Score: " + average);
    System.out.println();
    
     //Grade of test 7
    testGrade = 96;
    numTests++; 
    totalPoints += testGrade;
    average = (double) totalPoints/numTests;
    System.out.print("Test # " + numTests + " Test Grade: " + testGrade +  "    Total Points: " + totalPoints);
    System.out.println("    Average Score: " + average);
    System.out.println();
    
     //Grade of test 8
    testGrade = 89;
    numTests++; 
    totalPoints += testGrade;
    average = (double) totalPoints/numTests;
    System.out.print("Test # " + numTests + " Test Grade: " + testGrade +  "    Total Points: " + totalPoints);
    System.out.println("    Average Score: " + average);
    System.out.println();
    
    //Grade of test 9
    testGrade = 80;
    numTests++; 
    totalPoints += testGrade;
    average = (double) totalPoints/numTests;
    System.out.print("Test # " + numTests + " Test Grade: " + testGrade +  "    Total Points: " + totalPoints);
    System.out.println("    Average Score: " + average);
    System.out.println();
    */

    }

}