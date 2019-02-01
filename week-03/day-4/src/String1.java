public class String1 {
    public static void main(String[] args) {
        // Given a string, compute recursively (no loops) a new string where all the
        // lowercase 'x' chars have been changed to 'y' chars.

        String xToy = "xxhdhfgsdfxx";
        System.out.println(changeToY(xToy));
    }

    public static String changeToY(String word) {
        int baseCase = word.length();
        if(baseCase == 0){
            return "";
        }
        if(word.charAt(0) == 'x') {
            return 'y' + changeToY(word.substring(0+1,baseCase));
        }else{
            return word.charAt(0)+changeToY(word.substring(0+1,baseCase));
        }
    }
}