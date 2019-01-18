    import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner numbers = new Scanner(System.in);

        int n = numbers.nextInt();


        for (int i = 1; i < 11; i++) {
            System.out.println(i + " " + "x" + " " + n + " " + "=" + " " + n * i);


        }

    }
}
