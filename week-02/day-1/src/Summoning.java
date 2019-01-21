public class Summoning {
    public static void main(String[] args) {

    //  Create the usual class wrapper
    //  and main method on your own.

    // - Write a function called `sum` that sum all the numbers
    //   until the given parameter and returns with an integer

        int [] Numbers={5,6,7,8,3,2,5,6,7};

        int function=sum(Numbers);

    }
        public static int sum (int[] sumsum){

            int result=0;

            for (int i=0; i<sumsum.length; i++){
                result += sumsum[i];

            }
            System.out.println(result);
            return result;
        }


}
