import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
// Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.
        Scanner odds = new Scanner(System.in);


        int number=odds.nextInt();

        if(number/2==0){
            System.out.println("Odd");

        }else{
            System.out.println("Even");
        }




    }
}
