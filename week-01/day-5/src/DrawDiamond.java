import java.util.Scanner;
public class DrawDiamond {
    public static void main(String[] args) {

        Scanner pyramid = new Scanner(System.in);

        int n=pyramid.nextInt();


        int spaces=n/2;
        int stars=1;

        for(int i=0;i<n/2;i++){
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

        int otherSpace =0;
        int otherStar=stars;

        for(int i=0;i<n/2+1;i++){
            for(int j=0;j<otherSpace;j++){
                System.out.print(" ");
            }
            for(int k=0;k<otherStar;k++){
                System.out.print("*");
            }

        otherSpace++;
        otherStar=otherStar-2;
        System.out.println();

        }



    }
}