import java.util.Arrays;
import java.util.ArrayList;
public class SolarSystem {

        public static void main(String... args){
            ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

            // Saturn is missing from the planetList
            // Insert it into the correct position
            // Create a method called putSaturn() which has list parameter and returns the correct list.

            // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"



            putsaturn(planetList);
            System.out.println(planetList);

        }
            public static ArrayList<String> putsaturn(ArrayList<String> planet){


                 planet.add(5,"Saturn");


                return planet;
            }








}
