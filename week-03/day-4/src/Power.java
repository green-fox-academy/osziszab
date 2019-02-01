import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        // Given base and n that are both 1 or more, compute recursively (no loops)
        // the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(power(base, n));
    }
    public static int power (int base, int n){
        if (n == 1){
            return base;
        }
        return(base* power(base, n-1));
    }
}
