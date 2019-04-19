public class Police {
    private int lastx;
    private int lasty;
    private int currentx;
    private int currenty;
    private int moveNumbers = 0;

    public Police(int x,int y){
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

}
