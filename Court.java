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
        HashMap<Integer, Integer> randomIds = new HashMap<Integer, Integer>();
        for (int i = 0; i < policeNumbers; i++) {
            int x = randomGenator.nextInt(length);
            int y = randomGenator.nextInt(width);
            if (randomIds.containsKey(x))
                if (randomIds.get(x) == y) {
                    System.out.println("random not created");
                    i--;
                    break;
                }
            randomIds.put(x, y);
            court[x][y] = "P";
            Police p = new Police();
            polices.add(p);
            System.out.println("Random created for police " + i);

        }

    }

    public void placeThief
}
