public class Thief {
    private int currentx;
    private int currenty;
    private int moveNumbers = 0;

    public  Thief(int currentx, int currenty){
        this.currentx = currentx;
        this.currenty = currenty;
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
}
