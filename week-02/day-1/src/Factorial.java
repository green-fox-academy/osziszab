import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {

    //  Create the usual class wrapper
    //  and main method on your own.

    // - Create a function called `factorio`
    //   that returns it's input's factorial
        Scanner factor = new Scanner(System.in);

        int numbers=factor.nextInt();

        int function = factorio(numbers);

    }
        public static int factorio (int a){

            int result=1;

            for(int i=1 ; i<=a; i++){

                result=result*i;

            }
            System.out.println(result);
            return  result;


        }



}
