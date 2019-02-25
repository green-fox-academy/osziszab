import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exersice9 {
    public static void main(String[] args) {

        String text = "Hagymás tojásos tartáros sonkás szendvics";
        List<Character> list = text.chars()
                .mapToObj((i) -> Character.valueOf((char) i))
                .collect(Collectors.toList());
        Map<Character, Long> numberOfCharacters = list.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(numberOfCharacters.toString());
    }
}
