import java.util.*;
public class matchmaking {
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // If someone has no pair, he/she should be the element of the list too
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        makingMatches(girls,boys);



        System.out.println(makingMatches(girls,boys));


        }
        public static ArrayList<String> makingMatches(ArrayList<String>g,ArrayList<String>b){

            ArrayList<String>pairs =new ArrayList<>();

            for( int i=0;i<b.size();i++){
                if(i<g.size()) {
                    pairs.add(g.get(i));
                }
                if(i<b.size()){
                    pairs.add((b.get(i)));
                }


            }


            return pairs;
    }


}
