import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Thread;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        final Scanner scan = new Scanner(System.in);
        int length;
        int width;
        int policeNumbers;
        System.out.println("Enter length and width for the court dimensions");
        length = scan.nextInt();
        width = scan.nextInt();

        System.out.println("Enter the number of polices");
        policeNumbers = scan.nextInt();


        Court playGround = new Court(length,width);

        playGround.placePolicesRandomly(policeNumbers);
        playGround.placeThiefRandomly();
        playGround.displayCourt();
        System.out.println("\n\n\n");
        ArrayList<Police> polices = playGround.getPolices();

        while(true){

        playGround.getThief().moveRandomly(length,width);
        playGround.updateCourt();
        for(Police police:polices)
            police.moveRandomly(length,width);

        playGround.updateCourt();
        playGround.displayCourt();
        System.out.println("\n\n\n");
            Thread.sleep(1000);
        }








    }
}
