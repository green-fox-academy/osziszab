import java.util.Scanner;
public class MileToKmConverter {

    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

    Scanner meter = new Scanner(System.in);

        int kilometer=meter.nextInt();

        double miles =kilometer*0.62137119;
        System.out.println(miles+" mile(s)");




    }



}
