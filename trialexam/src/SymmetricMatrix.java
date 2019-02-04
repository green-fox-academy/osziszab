import java.util.Arrays;
import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] myArray = new int[n][n];

        for (int i = 0; i < n; i++){
            myArray[i][i] = scanner.nextInt();
            for(int j = 0; j < i; j++) {
                myArray[i][j] = scanner.nextInt();
            }
        }
        System.out.println(isSymmetric(myArray));
        System.out.println(Arrays.deepToString(myArray));

    }
    public static boolean isSymmetric (int[][] array){
        boolean symmetric = false;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < i; j++) {
                if (array[i][j] == array[j][i]){
                    symmetric = true;
                }else{
                    symmetric = false;
                }
            }
        }
        return symmetric;
    }
}
