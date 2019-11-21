/*
 * author: Jacob Kanfer
 * date: 11/20/2019
 * purpose: Convert your V3 object class to V7 implementation and client classes and instantiate multiple objects.
 */

public class SquareV7 {

    //instance variables
    private double length;
    private double width;
    private double height;

    //constructor
    public SquareV7(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    //volume function
    public double calcVolume(double length, double width, double height) {
        return length * width * height;
    }

    //area function
    public double calcArea(double length, double width) {
        return length * width;
    }

    public double calcVolume(double side) {
        return Math.pow(side, 3);
    }

    public double calcArea(double side) {
        return Math.pow(side, 2);
    }
}