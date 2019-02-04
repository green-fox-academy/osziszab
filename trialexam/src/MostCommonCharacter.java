import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MostCommonCharacter {
    public static void main(String[] args) {

        String fileName = "Example";

    }
    public static void printMostCommonCHaracer(String fileName){
        try {
        Path pathToTheFile = Paths.get("Example.txt");
        List<String> lines = Files.readAllLines(pathToTheFile);

        // i need more time to finish this :(

        }catch (Exception ex){
            System.out.println("File does not exist!");
        }
    }
}
