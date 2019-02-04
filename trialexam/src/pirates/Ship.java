package pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    List<Pirate> ship = new ArrayList<>();

    public void getPoorPirates(List ship){
        List<Pirate> result = new ArrayList<>();

        for (Pirate pirate: ship) {
            if (pirate.woodenLeg=true && pirate.gold < 15) {
                result.add(pirate);
            }
        }
        System.out.println(result);
    }
    public void lastDayOnTheShip(){

    }
}
