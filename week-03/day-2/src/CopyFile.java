import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        // Write a function that copies a file to an other
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful

        String fileToCopy = "my-file.txt";
        String fileFromCopy = "myfile.txt";

        System.out.println(copyFile(fileFromCopy,fileToCopy));
    }
    public static boolean copyFile (String from, String to){
        try {
            List<String> copyFrom = Files.readAllLines(Paths.get(from));
            List<String> pasteTo = Files.readAllLines(Paths.get(to));
            copyFrom.addAll(pasteTo);
            Files.write(Paths.get(from), copyFrom);
            Files.write(Paths.get(to), pasteTo);
        }catch (Exception ex){
            System.out.println("false");
        }
        return true;
    }
}
