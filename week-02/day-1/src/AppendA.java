public class AppendA {
    public static void main(String[] args) {

        //Create the usual class wrapper
        //  and main method on your own.

        // - Create a string variable named `typo` and assign the value `Chinchill` to it
        // - Write a function called `appendAFunc` that gets a string as an input,
        //   appends an 'a' character to its end and returns with a string
        //
        // - Print the result of `appendAFunc(typo)`

        String typo ="Chinchill";

        String function = AppendAFunc(typo);
    }
        public static String AppendAFunc (String text ){
            String result = text + "a";
            System.out.println(result);
            return result;

        }



}
