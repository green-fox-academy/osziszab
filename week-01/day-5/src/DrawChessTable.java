import java.util.Scanner;
public class DrawChessTable {
    public static void main(String[] args) {

        Scanner chess=new Scanner(System.in);
        int n=chess.nextInt();

        for(int i=0;i<n/2;i++){
            for(int j=0;j<n-1;j++){
                System.out.print("% ");
            }
            System.out.println();
            for (int k=0;k<n-1;k++){
                System.out.print(" %");
            }
            System.out.println();

        }


    }
}
