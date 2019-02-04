package pirates;
import java.util.ArrayList;
import java.util.List;
public class Ship {

    List<Pirate> ship = new ArrayList<>();

    public void fillTheShip(Pirate pirate){
     while ( pirate.captain != true){
         ship.add(pirate);
     }
    }

    public void getPoorPirates(){
        List<Pirate> result = new ArrayList<>();

        for (Pirate pirate : ship) {
            if (pirate.woodenLeg=true && pirate.gold < 15) {
                result.add(pirate);
            }
        }
        System.out.println(result);
    }

    public int getGolds(){
        int sumGold = 0;
        for( Pirate pirategold : ship){
            sumGold += pirategold.gold;
        }
        return sumGold;
    }

    public void lastDayOnTheShip(){
        for(Pirate partypirate : ship){
            partypirate.party();
        }
    }

    public void prepareForBattle(){
        for ( Pirate battelingpirates : ship){
            for ( int i = 0; i < 5; i++){
                battelingpirates.work();
            }
            battelingpirates.party();
        }
    }
}
