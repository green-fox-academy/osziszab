import java.util.Scanner;

public class Bunny2 {
    public static void main(String[] args) {
        // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
        // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
        // have 3 ears, because they each have a raised foot. Recursively return the
        // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

        Scanner scanner = new Scanner(System.in);
        int numberOFBunnies = scanner.nextInt();
        System.out.println(countears(numberOFBunnies));
    }
    public static int countears( int bunnies){
        int bunnyEars = 2;

        if (bunnies == 1) {
            return bunnyEars;
        }
        if (bunnies % 2 == 0) {
            bunnyEars= 3;
        }
        return countears(bunnies-1) + bunnyEars;
    }
}
