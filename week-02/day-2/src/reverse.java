public class reverse {
    public static void main(String... args){

        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.


        String function=reverse(reversed);

        System.out.println(function);


    }

    public static String reverse(String backward){

        String result="";
        for(int i=backward.length()-1; i>=0; i--) {
            result = result + backward.charAt(i);
        }

        return result;

    }

}
