import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
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
        playGround.thief.moveRandomly(length,width);
        playGround.updateCourt();
        playGround.displayCourt();





    }
}
