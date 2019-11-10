/* author: Jacob Kanfer
 * purpose: Write a program to calculate the (x, y) coordinates of points on a circle of a given radius..
 * date: 10/23/2019
 */

import java.util.Scanner;

public class CirclePoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //init variables
        double xCord = 1.0;
        double yCord = 1.0;
        double negY;
        double radius;
        double increment;

        //ask for radius
        System.out.println("Please input a radius");
        radius = in.nextDouble();

        //ask for increment
        System.out.println("Please enter an increment");
        increment = in.nextDouble();


        System.out.printf("%42s\n", "Points on a Circle with a Radius of " + radius);
        System.out.println("*********************************************");

        //print initial
        yCord = Math.sqrt((Math.pow(radius, 2) - Math.pow(xCord, 2)));
        System.out.printf("%10.2f%10.2f%10.2f%10.2f\n", xCord, yCord, xCord, yCord * -1);

        //start test
        for(int trial = 0; trial < 20; trial++) {
            xCord -= increment;
            yCord = Math.sqrt((Math.pow(radius, 2) - Math.pow(xCord, 2)));
            negY = yCord * -1;
            System.out.printf("%10.2f%10.2f%10.2f%10.2f\n", xCord, yCord, xCord, negY);
        }
    }
}


