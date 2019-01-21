import java.util.Arrays;
public class ReberseList {

    public static void main(String[] args) {

// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`


        int [] aj={3, 4, 5, 6, 7};
        int temp=0;

        for( int i=0; i<aj.length/2; i++){
            int reverse=aj[i];
            aj [i]=aj[aj.length-i-1];
            aj[aj.length-i-1]=reverse;

        }
        System.out.println(Arrays.toString(aj));




    }



}
