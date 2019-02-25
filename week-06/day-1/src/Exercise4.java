import java.util.Arrays;
import java.util.List;

public class Exercise4 {
    public static void main(String[] args) {

        int sum = 0;
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        double avregeOddNumbers = numbers.stream()
                .filter(s -> s % 2 == 1)
                .mapToInt( s-> s )
                .summaryStatistics()
                .getAverage();
        System.out.println(avregeOddNumbers);
    }
}
