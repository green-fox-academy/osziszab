package garden;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Garden garden = new Garden();
         garden.plantStatus();
         garden.giveWater(40);
         garden.plantStatus();
         garden.giveWater(70);
         garden.plantStatus();
    }
}
