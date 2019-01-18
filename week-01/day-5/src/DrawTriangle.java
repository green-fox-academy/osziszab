import java.util.Scanner;
public class DrawTriangle {
    public static void main(String[] args) {

        Scanner triangle= new Scanner(System.in);

        int n=triangle.nextInt();
        int stars=1;

        for(int i=0;i<n;i++){
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }

            stars++;
            System.out.println();
        }

    }

}
