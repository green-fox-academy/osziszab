import java.util.Scanner;
public class ParametricAvarge {
    public static void main(String[] args) {

        Scanner task= new Scanner(System.in);

        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:

        // Sum: 22, Average: 4.4

        int number=task.nextInt();
        int [] fullOfNumbers=new int[number];
        int sum=0;

        for(int i=0;i<number;i++){

            int box=task.nextInt();
            fullOfNumbers[i]=box;
            sum=sum+fullOfNumbers[i];
        }
        System.out.println(sum);
        double avrage=sum/number;
        System.out.println(avrage);

    }
}
