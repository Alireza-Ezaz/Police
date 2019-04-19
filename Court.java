import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Court {
    private int length;
    private int width;
    private ArrayList<Police> polices = new ArrayList<Police>();
    private Thief thief;

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
            boolean bl = true;
            if (polices.size() != 0) {
                for (Police police : polices) {
                    if (police.getCurrentx() == x && police.getCurrenty() == y) {
                        i--;
                        bl = false;
                        //////////////////////////////////////////////
                        break;
                    }
                }
            }
            if (bl == true) {
                court[x][y] = "P";
                Police p = new Police(x, y);
                polices.add(p);
                System.out.println("Random created for police " + i);
            }


        }

    }
    //We call this method after placing polices

    public void placeThiefRandomly() {
        Random randomGenrator = new Random();
        while (true) {
            int x = randomGenrator.nextInt(length);
            int y = randomGenrator.nextInt(width);
            boolean b = true;
            for (Police police : polices) {
                if (police.getCurrentx() == x && police.getCurrenty() == y)
                    b = false;
            }
            if(b == true){
                thief = new Thief(x,y);
                court[x][y] = "D";
                System.out.println("Random created for the thief " );
                break;
            }
        }
    }


}


// public void placeThief

