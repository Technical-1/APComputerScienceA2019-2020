/*
 * author: Jacob Kanfer
 * date: 12/2/2019
 * purpose: Expand your V7 object implementation class and client class to manage an array of data. Find the min, max, and avg values
 */

public class V8Tester {
    public static void main(String[] args) {

        double minArea = Double.MAX_VALUE;
        double minVolume = Double.MAX_VALUE;
        double maxArea = Double.MIN_VALUE;
        double maxVolume = Double.MIN_VALUE;
        double avgArea = 0;
        double avgVolume = 0;

        double[] areaArray = new double[5];
        double[] volumeArray = new double[5];

        //create objs
        SquareV8[] squares = {new SquareV8(10, 10.5, 12.5),
                new SquareV8(5, 5, 5),
                new SquareV8(10, 10, 5),
                new SquareV8(3, 3, 3),
                new SquareV8(6, 6, 6)};

        //print results
        System.out.println("Output results \n");
        System.out.println("                             Cubes                     ");
        System.out.println(" Number     Length    Width       Height       Area        Volume");

        for(int index = 0; index < squares.length; index++) {
            //do calculations
            squares[index].calcCubeArea();
            areaArray[index] = squares[index].getCubeArea();
            squares[index].calcCubeVolume();
            volumeArray[index] = squares[index].getCubeVolume();


            if(areaArray[index] < minArea) {
                minArea = areaArray[index];
            }

            if(volumeArray[index] < minVolume) {
                minVolume = volumeArray[index];
            }

            if(areaArray[index] > maxArea) {
                maxArea = areaArray[index];
            }

            if(volumeArray[index] > maxVolume) {
                maxVolume = volumeArray[index];
            }
        }

        //calc averages
        for(int i = 0; i < areaArray.length; i++) {
            avgArea += areaArray[i];
        }
        avgArea = (avgArea / areaArray.length);

        for(int i = 0; i < volumeArray.length; i++) {
            avgVolume += volumeArray[i];
        }
        avgVolume = (avgVolume / volumeArray.length);

        for(int index = 0; index < squares.length; index++) {
            System.out.println((index + 1) + squares[index].toString());
        }
        System.out.println("***********************************");
        System.out.println(("                                   Minimum " + minArea + "    " + minVolume));
        System.out.println(("                                   Maximum " + maxArea + "    " + maxVolume));
        System.out.println(("                                   Average " + avgArea + "    " + avgVolume));
    }
}