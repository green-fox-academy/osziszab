import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {

// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        try {
        int finalresult = takenumber(number);
            System.out.println(finalresult);
        }catch (ArithmeticException ex){
            System.err.println("fail");
        }




    }
    public static int takenumber(int number){

        int result = 10 / number;
        return result;0
    }
}
