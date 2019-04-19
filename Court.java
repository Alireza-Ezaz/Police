import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Court {
    public final int length;
    public final int width;
    public ArrayList<Police> polices = new ArrayList<Police>();
    public Thief thief;

    public String[][] court;

    public Court(int length, int width) {
        this.length = length;
        this.width = width;
        court = new String[length][width];
        for (int i = 0; i < length; i++)
            for (int j = 0; j < width; j++)
                court[i][j] = "-";
    }

    public void updateCourt() {
        for (int i = 0; i < length; i++)
            for (int j = 0; j < width; j++)
                court[i][j] = "-";

        court[thief.getCurrentx()][thief.getCurrenty()] = "D";

        for (Police police : polices){
            if(court[police.getCurrentx()][police.getCurrenty()].equals("D") || court[police.getLastx()][police.getLasty()].equals("D") )
            {
                System.out.println("The thief was arrested");
                displayCourt();
                System.exit(0);
            }
            court[police.getCurrentx()][police.getCurrenty()] = "P";
        }


    }

    public void setThief(Thief thief) {
        this.thief = thief;
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
               // System.out.println("Random created for police " + i);
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
            if (b == true) {
                thief = new Thief(x, y);
                //thief.setCurrentx(x);
                //thief.setCurrenty(y);
                court[x][y] = "D";
                System.out.println("Random created for the thief ");
                break;
            }
        }
    }

    public void displayCourt() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++)
                System.out.print(court[i][j] + " |");
            System.out.println();
        }

    }


}


// public void placeThief

