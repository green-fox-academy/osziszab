import java.util.Scanner;

public class NumberAdder {
    public static void main(String[] args) {
        // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        addsOne(n);
    }
    public static void addsOne(int n) {
        if (n >= 1) {
            addsOne(n-1);
        System.out.println(n);
        }
    }
}
