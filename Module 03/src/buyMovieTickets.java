/*
 * This program prints you a digital receipt for your movie tickets
 *
 * @Jacob Kanfer
 * @09/03/2019
 */

import java.util.Scanner;

public class buyMovieTickets {
    public static void main(String[] args) {

        //declare scanner
        Scanner in = new Scanner(System.in);

        //local Variables
        String name;
        String date;
        String movieName;
        String ticketAmount;
        String price;
        String debitCardNumber;
        int debitPin;
        //user input
        System.out.println("Good Evening. \n Please enter your first and last name:");
        name = in.nextLine();

        System.out.println("Please enter today's date (mm/dd/yyyy): ");
        date = in.nextLine();
        System.out.println("What movie would you like to see?");
        movieName = in.nextLine();
        System.out.println("How many tickets?");
        ticketAmount = in.next();
        int ticketInt = Integer.parseInt(ticketAmount);
        System.out.println("What is the cost per ticket?");
        price = in.next();
        double priceDouble = Double.parseDouble(price);
        System.out.println("Enter your debit card number (#####-###-####): ");
        debitCardNumber = in.next();
        System.out.println("Enter your PIN (####): ");
        debitPin = in.nextInt();

        //seperate first and last name
        int nameSpace = name.indexOf(" ");
        String firstName = name.substring(0, nameSpace);
        String lastName = name.substring(nameSpace + 1);

        //censor out account name
        int indexOfFirstDash = debitCardNumber.indexOf("-");
        int indexOfSecondDash = debitCardNumber.indexOf("-", indexOfFirstDash + 1);

        String lastFourDebit = debitCardNumber.substring(indexOfSecondDash);
        String firstDebitDigits = debitCardNumber.substring(0, indexOfSecondDash);
        firstDebitDigits = firstDebitDigits.replaceAll("[1234567890]", "#");
        String accountNumber = firstDebitDigits + lastFourDebit;

        //receipt print
        System.out.println("\n ------------------------------------------------------------------");
        System.out.println(" ------------------------------------------------------------------");
        System.out.println("Your E-Receipt   ");
        System.out.println();

        //date
        String newDate = date.replace("/", "-");
        System.out.println(newDate);

        //date order number
        System.out.println("Order number: " + name.substring(1,3) +  debitCardNumber.substring(6, 9));
        System.out.println();

        //name
        System.out.println("   " + firstName.substring(0, 1) + ".\t" + lastName);

        //acc num
        System.out.println("   Account: " + accountNumber);

        //movie name
        System.out.println("   Movie: " + movieName);

        //num of tickets
        System.out.println("   Number of Tickets: " + ticketAmount);

        //ticket price
        System.out.println("   Ticket Price: " + price);

        //total price
        System.out.println("\n   $" + (double) (priceDouble * ticketInt) + " will be debited to your account.");

        //end of ticket
        System.out.println("\n   Thank you. Enjoy your movie tonight.");
        System.out.println("------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------");



    }
}
