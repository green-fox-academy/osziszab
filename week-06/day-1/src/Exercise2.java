import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        List<Integer> squredNumbers = numbers.stream().filter(s -> s > 0).map(s -> s * s).collect(Collectors.toList());
        System.out.println(squredNumbers.toString());

    }
}
