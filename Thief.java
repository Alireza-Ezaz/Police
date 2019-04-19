import java.util.Random;

public class Thief {
    private int currentx;
    private int currenty;
    private int moveNumbers = 0;

    public Thief(int currentx, int currenty) {
        this.currentx = currentx;
        this.currenty = currenty;
    }
    public Thief(){
        currenty = currentx = 0;
    }

    public void setCurrentx(int currentx) {
        this.currentx = currentx;
    }

    public void setCurrenty(int currenty) {
        this.currenty = currenty;
    }

    public void setMoveNumbers(int moveNumbers) {
        this.moveNumbers = moveNumbers;
    }

    public int getCurrentx() {
        return currentx;
    }

    public int getCurrenty() {
        return currenty;
    }

    public int getMoveNumbers() {
        return moveNumbers;
    }

    public void moveRandomly(int length, int width) {
        Random randomGenerator = new Random();
        int rx = randomGenerator.nextInt(3) - 1;
        int ry = randomGenerator.nextInt(3) - 1;


        if (currentx != 0 && currentx != length - 1 && currenty != 0 && currenty != width) {
            currentx = currentx + rx;
            currenty = currenty + ry;
        }

    }
}
