import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

public class Court {
    private final int length;
    private final int width;
    private ArrayList<Police> polices = new ArrayList<Police>();
    private Thief thief;

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
        boolean b = false;
        for (Police police : polices) {

            if (court[police.getCurrentx()][police.getCurrenty()].equals("D")) {
                b = true;
                System.out.println("The thief was arrested by police in * field");
                System.out.println("thief moved: " + thief.getMoveNumbers() + " times");
                System.out.println("police moved: " + polices.size() * thief.getMoveNumbers()+" times");
                court[police.getCurrentx()][police.getCurrenty()] = "*";

            }
            if (court[police.getLastx()][police.getLasty()].equals("D")) {
                b = true;
                System.out.println("The thief himself went to the Police station in * field");
                System.out.println("thief moved: " + thief.getMoveNumbers() + " times");
                System.out.println("police moved: " + polices.size() * thief.getMoveNumbers()+" times");
                court[police.getCurrentx()][police.getCurrenty()] = "*";

            }
            if(!court[police.getCurrentx()][police.getCurrenty()].equals("*"))
            court[police.getCurrentx()][police.getCurrenty()] = "P";
        }
        if(b == true){
            displayCourt();
            System.exit(0);
        }


    }

    public void setThief(Thief thief) {
        this.thief = thief;
    }

    public Thief getThief() {
        return thief;
    }

    public String[][] getCourt() {
        return court;
    }

    public ArrayList<Police> getPolices() {
        return polices;
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
                System.out.print(court[i][j] + " | ");
            System.out.println();
        }

    }


}


// public void placeThief

