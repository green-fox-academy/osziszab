import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.

            String nameOfTheFile = "my-file.txt";
            int result = countNumberOfTheLines(nameOfTheFile);
            System.out.println(result);
    }
    public static int countNumberOfTheLines(String fileName){

        Path pathOfTheFile = Paths.get(fileName);
        try{
            List<String> lines = Files.readAllLines(pathOfTheFile);
            int numberOfLines = lines.size();
            return numberOfLines;

        } catch (IOException ex) {
            return 0;
        }
    }
}
