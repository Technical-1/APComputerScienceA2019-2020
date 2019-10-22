/**
 * Annual Weather description: Display data of precipitation and temperature based on the users prefered scale and round the averages to the nearest tenth
 *
 * @author Jacob Kanfer
 * @version 12 October 2019
 *
 */
import java.util.Scanner;
public class AnnualWeatherV2 {
    public static void main (String [ ] args) {

        //Declare and initialize variables
        Scanner in = new Scanner(System.in);
        String city = "Tallahassee";
        String state = "Florida";

        String [] month = {"Jan", "Feb" , "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
        double [] temperature ={51.8, 54.8, 61.1, 66.4, 74.4, 80.4, 82.4, 82.1, 78.9, 69.1, 60.4, 53.7};     //initialize with Fahrenheit values
        double [] precipitation ={13.7, 11.7, 16.5, 9.1, 12.7, 17.5, 20.3, 17.8, 12.7, 8.4, 9.9, 10.4};      //initialize with inch values

        /* Second set
        String city = "Orlando";
        String state = "Florida";

        String [] month = {"Jan", "Feb" , "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
        double [] temperature ={60.9, 62.6, 67.4, 71.5, 77.1, 81.2, 82.4, 82.5, 81.1, 75.3, 68.8, 63.0};     //initialize with Fahrenheit values
        double [] precipitation ={2.4, 2.4, 3.5, 2.4, 3.7, 7.4, 7.2, 6.3, 5.8, 2.7, 2.3, 2.3};      //initialize with inch values
        */

        String tempLabel = "";    //initialize temp label
        String precipScale = ""; //initialize precip scale

        double tempAverage = 0.0;
        double precipTotal = 0.0;

        //Processing - calculate average temperature and total precipitation
        for(int index = 0; index < temperature.length; index++) {
            tempAverage += temperature[index];
            precipTotal += precipitation[index];
        }

        System.out.println("Choose the temperature scale (F = Fahrenheit, C = Celsius");
        tempLabel = in.next();

        while(!(tempLabel.equalsIgnoreCase("f") || tempLabel.equalsIgnoreCase("c"))) {
            System.out.println("Select a valid temperature scale (F = Fahrenheit, C = Celsius");
            tempLabel = in.next();
        }

        if(tempLabel.equalsIgnoreCase("f")) {
            tempAverage = tempAverage/temperature.length;
        } else {
            tempAverage = tempAverage/temperature.length;
            tempAverage = ((tempAverage-32) * 5.0)/9;
        }

        System.out.println("Choose the precipitation scale (i = inches, c = centimeters");
        precipScale = in.next();

        while(!(precipScale.equalsIgnoreCase("i") || precipScale.equalsIgnoreCase("c"))) {
            System.out.println("Select a valid precipitation scale (i = inches, c = centimeters)");
            precipScale = in.next();
        }

        if(precipScale.equalsIgnoreCase("i")) {
            precipTotal = precipTotal/2.54;
        }

        //Output: display table of weather data including average and total
        System.out.println();
        System.out.printf("%30s\n", "Weather Data");
        System.out.printf("%40s\n", "Location: " + city + ", " +state);
        System.out.printf("%7s%22s%22s\n", "Month", "Temperature: " + tempLabel, "Precipitation: " + precipScale);
            System.out.println();
        System.out.println("***************************************************");
        for( int index = 0; index < temperature.length; index++) {
            System.out.printf("%5s%18s%18s\n", month[index], temperature[index], precipitation[index]);
        }
        System.out.println("***************************************************");
        System.out.printf("%8s%1.1f%18s%1.1f\n", "Average: ", tempAverage, "Annual: ", precipTotal);
    }//end main
}//end class

