import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {
    public static void main(String[] args) {

        List<Character> letter = Arrays.asList('a', 'l', 'm','a');

        String newWord = letter.stream()
                .map(String :: valueOf)
                .collect(Collectors.joining());
        System.out.println(newWord);
    }
}
