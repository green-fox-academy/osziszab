package postIt;

import javafx.geometry.Pos;

public class Main {
    public static void main(String[] args) {

       /* Create a PostIt class that has
                a backgroundColor
                a text on it
                a textColor
                Create a few example post-it objects:
        an orange with blue text: "Idea 1"
        a pink with black text: "Awesome"
        a yellow with green text: "Superb!"
      */


        PostIt firstExample = new PostIt("orange","Idea 1", "blue" );
        PostIt secondExample = new PostIt("pink", "Awsome", "black");
        PostIt thirdExample = new PostIt("yellow", "Superb!" ,"green");


    }
}
