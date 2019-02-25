import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise6 {
    public static void main(String[] args) {

        String text = "ahjkdfhakGHFAajdkaGHAGshd";
        List<Character> list = text.chars()
                .mapToObj((i) -> Character.valueOf((char)i))
                .collect(Collectors.toList());
        List<Character> upperLetters = list.stream()
                .filter(Character::isUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperLetters.toString());
    }
}
