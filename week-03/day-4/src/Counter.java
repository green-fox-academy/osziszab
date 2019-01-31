import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
// Write a recursive function that takes one parameter: n and counts down from n.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        counter(n);
    }
    public static void counter(int n) {
        if (n >= 0) {
            System.out.println(n);
            counter(n - 1);
        }
    }
}
