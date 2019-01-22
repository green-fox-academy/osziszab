import java.util.Scanner;
public class PalindromeYesOrNo {
    public static void main(String[] args) {

        Scanner task = new Scanner(System.in);

        String a = task.nextLine();


        palindrome(a);

        }
        public static void palindrome(String pali){

            int hossz = pali.length();

            boolean test = true;

            for(int i=0;i<hossz/2;i++){
                int h = hossz-i-1;

                char eleje = pali.charAt(i);
                char vege = pali.charAt(h);
                if(eleje != vege){
                    test = false;
                }

            }
            if(test==true){
                System.out.print("Yes");
            }else{
                System.out.print("No");
            }


        }





}
