import java.util.Scanner;
public class PrintBigger {
    public static void main (String[] args) {

        // Write a program that asks for two numbers and prints the bigger one

        Scanner task =new Scanner(System.in);

        int number1 = task.nextInt();
        int number2 = task.nextInt();

        if(number1>number2){
            System.out.println(number1);
        }else{
            System.out.println(number2);
        }



    }
}
