package Exercise10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        
        List<Fox> foxes = new ArrayList<>();
        foxes.add(new Fox("Weed", "green", 3));
        foxes.add(new Fox("Genius", "yellow", 2));
        foxes.add(new Fox("Kolumbia", "blue", 8));
        foxes.add(new Fox("Potato", "red", 5));
        foxes.add(new Fox("Hairy", "rouge", 15));

        System.out.println(foxes.stream()
                .map(s -> s.getColor())
                .collect(Collectors.toList()));

        System.out.println(foxes.stream()
                .filter(s -> s.getColor() == "green" && s.getAge() < 5)
                .map(s -> s.getName())
                .collect(Collectors.toList()));

        Map<String, Long> numberOfCharacters = foxes.stream()
                .collect(Collectors.groupingBy(s -> s.getColor(), Collectors.counting()));
        System.out.println(numberOfCharacters.toString());
    }
}
