import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String firstLetetr = scanner.nextLine();
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        cityByFirstLetter(firstLetetr, cities);
    }

    public static void cityByFirstLetter(String letter, List<String> texts) {
        if (texts.isEmpty()) {
            System.out.println("There is no text, which start with this letter");
        } else {
            System.out.println(texts.stream()
                    .filter(s -> s.startsWith(letter.toUpperCase()))
                    .collect(Collectors.toList()));

        }
    }
}
