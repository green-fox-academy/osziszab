import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercie3 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);
        List<Integer> squredNumberGretaerthan20 = numbers.stream().map(s -> s * s).filter(s -> s > 20).collect(Collectors.toList());
        System.out.println(squredNumberGretaerthan20.toString());
    }
}
