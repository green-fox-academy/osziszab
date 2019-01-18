import java.util.Scanner;
public class AvrageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        // Sum: 22, Average: 4.4

        Scanner avrage = new Scanner(System.in);

        int a =avrage.nextInt();
        int b=avrage.nextInt();
        int c=avrage.nextInt();
        int d=avrage.nextInt();
        int e=avrage.nextInt();

        int sum=a+b+c+d+e;
        double atlag=sum/5;


        System.out.println("Sum: "+sum);
        System.out.println("Avrage: "+atlag);





    }

}
