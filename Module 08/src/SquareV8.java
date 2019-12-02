/*
 * author: Jacob Kanfer
 * date: 12/2/2019
 * purpose: Expand your V7 object implementation class and client class to manage an array of data. Find the min, max, and avg values
 */

public class SquareV8 {

    //instance variables
    private double length;
    private double width;
    private double height;
    private double myArea;
    private double myVolume;

    //constructor
    public SquareV8(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
        myArea = 0.0;
        myVolume = 0.0;
    }

    public void calcCubeArea() {
        myArea = length * width;
    }

    public double getCubeArea() {
        return myArea;
    }

    public void calcCubeVolume() {
        myVolume = length * width * height;
    }

    public double getCubeVolume() {
        return myVolume;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setLength(double l) {
        length = l;
    }

    public void setWidth(double w) {
        length = w;
    }

    public void setHeight(double h) {
        length = h;
    }

    public String toString() {
        return String.format("%12.1f %9.1f %9.1f %14.1f %13.1f",
                length,
                width,
                height,
                myArea,
                myVolume);
    }
}
