import java.util.*;
public class AppednLetter {
    public static void main(String... args){
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.


        System.out.println(appendA(far));
    }
    public static List<String> appendA(List<String> miss){


        for ( int i=0; i<miss.size(); i++){
            miss.set(i, miss.get(i) + "a");
        }

        return miss;
    }


}
