import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Court {
    private int length;
    private int width;
    ArrayList<Police> polices = new ArrayList<Police>();
    ArrayList<Thief> thieves = new ArrayList<Thief>();

    private String[][] court;

    public Court(int length, int width) {
        this.length = length;
        this.width = width;

        court = new String[length][width];

    }

    public void placePolicesRandomly(int policeNumbers) {
        Random randomGenator = new Random();

        for (int i = 0; i < policeNumbers; i++) {
            int x = randomGenator.nextInt(length);
            int y = randomGenator.nextInt(width);
            /*
            if (polices.size() == 0) {
                court[x][y] = "P";
                Police p = new Police(x, y);
                polices.add(p);
                System.out.println("Random created for police " + i);
                continue;
            }*/ else {
                boolean bl = true;

                for (Police police : polices) {
                    if (police.getCurrentx() == x && police.getCurrenty() == y) {
                        i--;
                        bl = false;
                        //////////////////////////////////////////////
                        break;
                    }
                }
                if(bl == true){
                    court[x][y] = "P";
                Police p = new Police(x, y);
                polices.add(p);
                System.out.println("Random created for police " + i);
                }





            }

        }

    }

}

// public void placeThief

