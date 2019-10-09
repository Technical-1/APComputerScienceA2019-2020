public class TrickOrTreat {
    public static void main(String args[]) {
        //initialize variables

        //start the loop
        for(int x = 0; x < 30; x++) {
            int randNum = (int) (Math.random() * 27) + 2;

            if (randNum % 3 == 0 && randNum % 7 == 0) {
                System.out.println("kit kat");
            } else if (randNum % 3 == 0) {
                System.out.println("snickers");
            } else if (randNum % 7 == 0) {
                System.out.println("reeses");
            } else if(randNum % 2 == 0) {
                System.out.println("smarties");
            } else {
                System.out.println("life saver");
            }
        }
    }
}

