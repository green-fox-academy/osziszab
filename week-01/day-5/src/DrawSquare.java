import java.util.Scanner;
public class DrawSquare {
    public static void main(String[] args) {

        Scanner square =new Scanner(System.in);

        int n =square.nextInt();

        int pillar=n-2;

        for(int i=0;i<n;i++){
            System.out.print("%");

        }
        System.out.println();

        for (int i=0;i<pillar;i++){
            System.out.print("%");
            for(int l=0;l<pillar;l++){
                System.out.print(" ");
            }
            System.out.print("%");
            System.out.println();
        }
        for(int i=0;i<n;i++){
            System.out.print("%");

        }



    }
}
