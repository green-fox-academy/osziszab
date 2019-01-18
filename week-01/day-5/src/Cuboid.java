import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000
    Scanner cuboid = new Scanner(System.in);

    double a =cuboid.nextDouble();
    double b = cuboid.nextDouble();
    double c = cuboid.nextDouble();

    double surface=2*((a*b)+(b*c)+(a*c));
    double valome =a*b*c;

        System.out.println("Surface Area: " + surface);
        System.out.println("volume: " + valome);






    }
}
