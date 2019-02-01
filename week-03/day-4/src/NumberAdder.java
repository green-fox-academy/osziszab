import java.util.Scanner;

public class NumberAdder {
    public static void main(String[] args) {
        // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(addsOne(n));
    }
    public static int addsOne(int n) {
        if (n == 1) {
            return 1;
        }
        return n + addsOne(n - 1);
    }
}
