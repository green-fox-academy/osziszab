import java.util.Scanner;

public class Bunny1 {
    public static void main(String[] args) {
        // We have a number of bunnies and each bunny has two big floppy ears.
        // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

        Scanner scanner = new Scanner(System.in);
        int numberOfBunnies = scanner.nextInt();
        System.out.println(countEars(numberOfBunnies));
    }
    public static int countEars(int bunnies){
        int numberOfEars = 0;
        if(bunnies <= 0){
            return 0;
        }
        numberOfEars =countEars(bunnies-1)+2;
        return numberOfEars;
    }
}
