/*
 * author: Jacob Kanfer
 * date: 11/19/2019
 * purpose: Using your notes as a reference, define an implementation class for an object of your choice
 */
import java.util.Scanner;

public class SquareV3 {

    //default constructor
    public SquareV3() {

    }

    //volume function
    public double volume(double length, double width, double height) {
        return length * width * height;
    }

    //area function
    public double area(double length, double width) {
        return length * width;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //make variables
        System.out.println("What do you want your square length to be (int)");
        int length = in.nextInt();
        System.out.println("What do you want your square width to be (int)");
        int width = in.nextInt();
        System.out.println("What do you want your square height to be (int)");
        double height = in.nextInt();

        double squareVolume = 0;
        double squareArea = 0;

        SquareV3 squares = new SquareV3();

        squareVolume = squares.volume(length, width, height);
        squareArea = squares.area(length, width);

        System.out.printf(" Square Area = %8.2f%n", squareArea);
        System.out.printf(" Square Volume = %8.2f%n", squareVolume);
    }
}