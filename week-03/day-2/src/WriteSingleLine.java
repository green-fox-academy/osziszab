import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"

        String name = "Osztertág Szabolcs";


            manipulateFile(name);

    }
    public static void manipulateFile (String text){
        try {
            Files.write(Paths.get("myfile.txt"), text.getBytes());
        }catch (Exception ex){
            System.out.println("Unable to write file: myfile.txt");
        }
    }

}