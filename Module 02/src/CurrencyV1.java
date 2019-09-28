/*
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Jacob Kanfer
 * @version 08/20/2019 
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;     // starting US Dollars

        double pesosSpent = 7210.25;            // Mexican Pesos spent
        double pesoExchangeRate = 19.57852;     // 1 US dollar = 19.57852 Pesos
        double dollarsSpentInMexico = (double) pesosSpent/pesoExchangeRate;      // US dollars spent in Mexico
        double dollarsAfterMexico = startingUsDollars - dollarsSpentInMexico;        // US dollars remaining after Mexico
        startingUsDollars = startingUsDollars - dollarsSpentInMexico;
        //remaining variables below here
        double yenSpent = 150000;
        double yenExchangeRate = 106.34; // 1USD = 106.34 Yen
        double dollarsSpentInJapan = (double) yenSpent/yenExchangeRate;
        double dollarsAfterJapan = startingUsDollars - dollarsSpentInJapan;
        startingUsDollars = startingUsDollars - dollarsSpentInJapan;

        double eurosSpent = 1300;
        double euroExchangeRate = 0.90; // 1USD = 0.90 Euros
        double dollarsSpentInGermany = (double) eurosSpent/euroExchangeRate;
        double dollarsAfterGermany = startingUsDollars - dollarsSpentInGermany;
        startingUsDollars = startingUsDollars - dollarsSpentInGermany;


        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Conversion
        // code goes below here
        System.out.println("Starting US dollars:        " + startingUsDollars);
        System.out.println();

        //Mexico
        System.out.println("Mexico:");
        System.out.println(" Pesos Spent:       " + pesosSpent);
        System.out.println(" US dollars equivalent:         " + dollarsSpentInMexico);
        System.out.println(" US dollars remaining:         " + dollarsAfterMexico);
        System.out.println();

        //Japan
        System.out.println("Japan:");
        System.out.println(" Yen Spent:       " + yenSpent);
        System.out.println(" US dollars equivalent:         " + dollarsSpentInJapan);
        System.out.println(" US dollars remaining:         " + dollarsAfterJapan);
        System.out.println();

        //Germany
        System.out.println("Germany:");
        System.out.println(" Euros Spent:       " + eurosSpent);
        System.out.println(" US dollars equivalent:         " + dollarsSpentInGermany);
        System.out.println(" US dollars remaining:         " + dollarsAfterGermany);
        System.out.println();

        // Complete the code below for Souvenir Purchases
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 12;                         //cost per item of first souvenir
        int budget1 = 100;                          //budget for first item
        int totalItems1 = budget1/costItem1;        //how many items can be purchased
        int fundsRemaining1 = budget1 % costItem1;  //how much of the budget is left

        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItems1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);
        System.out.println();

        //Calculations for Souvenir #2
        double costItem2 = 29.99;                       //cost per item of second souvenir
        int budget2 = 500;                              //budget for second item
        int totalItems2 = (int)(budget2/costItem2);    //how many items can be purchased
        double fundsRemaining2 = budget2 % costItem2;   //how much of the budget is left

        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItems2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class