import java.util.Random;

public class Police {
    private int lastx;
    private int lasty;
    private int currentx;
    private int currenty;
    private int moveNumbers = 0;

    public Police(int x, int y) {
        lastx = currentx = x;
        lasty = currenty = y;
    }

    public void setLastx(int lastx) {
        this.lastx = lastx;
    }

    public void setCurrentx(int currentx) {
        this.currentx = currentx;
    }

    public void setCurrenty(int currenty) {
        this.currenty = currenty;
    }

    public void setLasty(int lasty) {
        this.lasty = lasty;
    }

    public void setMoveNumbers(int moveNumbers) {
        this.moveNumbers = moveNumbers;
    }

    public int getMoveNumbers() {
        return moveNumbers;
    }

    public int getCurrentx() {
        return currentx;
    }

    public int getCurrenty() {
        return currenty;
    }

    public int getLastx() {
        return lastx;
    }

    public int getLasty() {
        return lasty;
    }

    public boolean lookForThief(int length, int width, int xThief, int yThief) {
        boolean bl = false;
            for (int i = currentx - 2; i <= currentx + 2; i++)
                for (int j = currenty - 2; j <= currenty + 2; j++)
                    if (i == xThief && j == yThief)
                        bl = true;

        return bl;
    }

    public void moveRandomly(int length, int width) {
        Random randomGenerator = new Random();
        moveNumbers++;

        if (currentx != 0 && currentx != length - 1 && currenty != 0 && currenty != width - 1) {
            int rx = randomGenerator.nextInt(3) - 1;
            int ry = randomGenerator.nextInt(3) - 1;
            lastx = currentx;
            lasty = currenty;
            currentx = currentx + rx;
            currenty = currenty + ry;
        }

        if (currentx == 0 && currenty != 0 && currenty != width - 1) {
            int rx = randomGenerator.nextInt(2);
            int ry = randomGenerator.nextInt(3) - 1;
            lastx = currentx;
            lasty = currenty;
            currentx = currentx + rx;
            currenty = currenty + ry;
        }
        if (currenty == 0 && currentx != 0 && currentx != length - 1) {
            int rx = randomGenerator.nextInt(3) - 1;
            int ry = randomGenerator.nextInt(2);
            lastx = currentx;
            lasty = currenty;
            currentx = currentx + rx;
            currenty = currenty + ry;

        }
        if (currentx == length - 1 && currenty != 0 && currenty != width - 1) {
            int rx = randomGenerator.nextInt(2) - 1;
            int ry = randomGenerator.nextInt(3) - 1;
            lastx = currentx;
            lasty = currenty;
            currentx = currentx + rx;
            currenty = currenty + ry;
        }
        if (currenty == width - 1 && currentx != 0 && currentx != length - 1) {
            int rx = randomGenerator.nextInt(3) - 1;
            int ry = randomGenerator.nextInt(2) - 1;
            lastx = currentx;
            lasty = currenty;
            currentx = currentx + rx;
            currenty = currenty + ry;
        }
        if (currentx == 0 && currenty == 0) {
            int rx = randomGenerator.nextInt(2);
            int ry = randomGenerator.nextInt(2);
            lastx = currentx;
            lasty = currenty;
            currentx = currentx + rx;
            currenty = currenty + ry;
        }
        if (currentx == length - 1 && currenty == 0) {
            int rx = randomGenerator.nextInt(2) - 1;
            int ry = randomGenerator.nextInt(2);
            lastx = currentx;
            lasty = currenty;
            currentx = currentx + rx;
            currenty = currenty + ry;
        }
        if (currentx == 0 && currenty == width - 1) {
            int rx = randomGenerator.nextInt(2);
            int ry = randomGenerator.nextInt(2) - 1;
            lastx = currentx;
            lasty = currenty;
            currentx = currentx + rx;
            currenty = currenty + ry;
        }
        if (currentx == length - 1 && currenty == width - 1) {
            int rx = randomGenerator.nextInt(2) - 1;
            int ry = randomGenerator.nextInt(2) - 1;
            lastx = currentx;
            lasty = currenty;
            currentx = currentx + rx;
            currenty = currenty + ry;
        }


    }


}
