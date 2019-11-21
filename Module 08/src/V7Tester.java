/*
 * author: Jacob Kanfer
 * date: 11/20/2019
 * purpose: Convert your V3 object class to V7 implementation and client classes and instantiate multiple objects.
 */

public class V7Tester {
    public static void main(String[] args) {
        double length1, length2, length3, width1, width2, width3, height1, height2, height3;
        double square1Area, square2Area, square3Area, square1Volume, square2Volume, square3Volume;
        length1 = 10; width1 = 10.5; height1 = 12.5; square1Area = 0; square1Volume = 0;
        //perfect cube
        length2 = 5; width2 = 5; height2 = 5; square2Area = 0; square2Volume = 0;
        //perfect square base
        length3 = 10; width3 = 10; height3 = 5; square3Area = 0; square3Volume = 0;

        //create objs
        SquareV7 square1 = new SquareV7(length1, width1, height1);
        SquareV7 square2 = new SquareV7(length2, width2, height2);
        SquareV7 square3 = new SquareV7(length3, width3, height3);

        square1Area = square1.calcArea(length1, width1);
        square1Volume = square1.calcVolume(length1, width1, height1);

        //perfect cube allows for math.pow function rather than lxwxh
        square2Area = square2.calcArea(length2, width2);
        square2Volume = square2.calcVolume(length2);

        //square base allows for math.pow rather than lxw
        square3Area = square3.calcArea(length3);
        square3Volume = square3.calcVolume(length3, width3, height3);

        System.out.println("----------------------------------------");
        System.out.printf(" Square1 Area = %8.2f%n", square1Area);
        System.out.printf(" Square1 Volume = %8.2f%n", square1Volume);
        System.out.println("----------------------------------------");
        System.out.printf(" Square2 Area = %8.2f%n", square2Area);
        System.out.printf(" Square2 Volume = %8.2f%n", square2Volume);
        System.out.println("----------------------------------------");
        System.out.printf(" Square3 Area = %8.2f%n", square3Area);
        System.out.printf(" Square3 Volume = %8.2f%n", square3Volume);
        System.out.println("----------------------------------------");
    }
}
