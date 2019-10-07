/*
 * Purpose: Write a program to generate random passwords; the user should be able to select the character set and the length.
 *
 * @author Jacob Kanfer
 * @version 10/7/2019
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SecretPasscodes {
    public static void main(String[] args) throws FileNotFoundException {
        //initialize scanners
        Scanner in = new Scanner(System.in);
        File myFile = new File("passwords.txt");
        PrintWriter outFile = new PrintWriter(myFile);
        Scanner inFile = new Scanner(myFile);

        //declare and initialize variables
        int userChoice;
        int pwLength;
        String password = "";
        double randomVal;

        //password generator menu
        System.out.println("Password Generator");
        System.out.println("==============================================================");
        System.out.println("  [1] Only lowercase Letters    ");
        System.out.println("  [2] Lowercase Letters and Numbers    ");
        System.out.println("  [3] Lower And Uppercase Letters And Numbers   ");
        System.out.println("  [4] All Letters Numbers and Symbols    ");
        System.out.println("  [5] Quit                      ");
        System.out.println("==============================================================");

        //ask for user option
        System.out.println("Please select an option (1-5)");
        userChoice = in.nextInt();

        //check to see if not 5
        while(userChoice != 5) {
            //check to see if its a valid option
            while (!(userChoice <= 5)) {
                System.out.println("Invalid option. Please try again");
                System.out.println("Please select an option (1-5)");
                userChoice = in.nextInt();
            }

            //ask for password length
            System.out.print("How long is your password? (At least 6)");
            pwLength = in.nextInt();

            //make sure password length fits requirements
            while (!(pwLength >= 6)) {
                System.out.println("Your password is too short. Please try again.");
                System.out.print("How long is your password? (At least 6)");
                pwLength = in.nextInt();
            }

            //choices
            if (userChoice == 1) {
                while (password.length() < pwLength) {
                    randomVal = Math.random() * 122;
                    while (!(randomVal >= 97 && randomVal <= 122)) {
                        randomVal = Math.random() * 122;
                    }
                    password += (char) (randomVal);
                }
            } else if (userChoice == 2) {
                while (password.length() < pwLength) {
                    randomVal = Math.random() * 122;
                    while (!((randomVal >= 48 && randomVal <= 57) || (randomVal >= 97 && randomVal <= 122))) {
                        randomVal = Math.random() * 122;
                    }
                    password += (char) (randomVal);
                }
            } else if (userChoice == 3) {
                while (password.length() < pwLength) {
                    randomVal = Math.random() * 122;
                    while (!((randomVal >= 48 && randomVal <= 57) || (randomVal >= 97 && randomVal <= 122) || (randomVal >= 65 && randomVal <= 90))) {
                        randomVal = Math.random() * 122;
                    }
                    password += (char) (randomVal);
                }
            } else if (userChoice == 4) {
                while (password.length() < pwLength) {
                    randomVal = Math.random() * 122;
                    while (!(randomVal >= 48 && randomVal <= 122)) {
                        randomVal = Math.random() * 122;
                    }
                    password += (char) (randomVal);
                }
            }
            //cleanup stuff
            outFile.println(password);
            password = "";
            System.out.println("Please select an option (1-5)");
            userChoice = in.nextInt();
        }
        outFile.close();

        System.out.println("\n Thank you for using the Pass Code Generator");
        System.out.println("\n Here are your randomly generated codes:");

        int pwCount = 0;
        while (inFile.hasNext()) {
             pwCount++;
             System.out.println(pwCount + " \t" + inFile.next());
        }
        inFile.close();
    }
}
