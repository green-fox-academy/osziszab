import java.util.Scanner;
public class DrawPyramid {
    public static void main(String[] args) {

        Scanner pyramid= new Scanner(System.in);

        int n=pyramid.nextInt();
        int spaces=n;
        int stars=1;

        for(int i=0;i<n;i++){
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            for(int k=0;k<stars;k++){
            System.out.print("*");
            }
            spaces--;
            stars=stars+2;
            System.out.println();
        }


    }

}
