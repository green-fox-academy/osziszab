public class takeslonger {
    public static void main(String... args){

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

            int it =quote.indexOf("It");
            int than=quote.indexOf("you");
            quote=quote.substring(0,it+3)+"always takes longer than "+quote.substring(than);


            System.out.println(quote);
    }
}
