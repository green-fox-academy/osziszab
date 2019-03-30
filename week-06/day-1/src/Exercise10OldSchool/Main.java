package Exercise10OldSchool;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Fox> foxes = new ArrayList<>();
        foxes.add(new Fox("Weed", "green", 3));
        foxes.add(new Fox("Genius", "yellow", 2));
        foxes.add(new Fox("Kolumbia", "blue", 8));
        foxes.add(new Fox("Potato", "red", 5));
        foxes.add(new Fox("Hairy", "rouge", 15));
        foxes.add(new Fox("Kratos", "blue", 14));

        Map<String, Integer> foxColors = new HashMap<>();
        for (Fox fox : foxes) {
            if (fox.getColor().equals("green")) {
                System.out.println(fox.getName());
            }
            if (fox.getColor().equals("green") && fox.getAge() < 5) {
                System.out.println(fox.getName());
            }

            if (foxColors.containsKey(fox.getColor())) {
                foxColors.put(fox.getColor(), foxColors.get(fox.getColor()) + 1);
                System.out.println(Collections.singletonList(foxColors));
            } else {
                foxColors.put(fox.getColor(), 1);
            }
        }
    }
}

