import java.util.Scanner;
public class AnimalsAndLegs {

    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner farm =new Scanner(System.in);

        int chickens=farm.nextInt();
        int pigs=farm.nextInt();
        int legs=(chickens*2)+(pigs*4);

        System.out.println(legs);




    }

}
