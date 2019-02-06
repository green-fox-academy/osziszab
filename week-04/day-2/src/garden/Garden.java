package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    List<Plant> palnts;

    public Garden(){
        this.palnts = new ArrayList<>();
        Flower flower1 = new Flower(1,"yellow",0,0.75);
        Flower flower2 = new Flower(1,"blue",0,0.75);
        Tree tree1 = new Tree(1,"purple",0,0.40);
        Tree tree2 = new Tree(1,"orange",0,0.40);
        palnts.add(flower1);
        palnts.add(flower2);
        palnts.add(tree1);
        palnts.add(tree2);
    }

    public void giveWater(int water){
        System.out.println("Watering with " + water);
        int amountWater = water/palnts.size();
        for (Plant plant : palnts ){
            plant.waterNeed += amountWater*plant.waterAbsorbtion;
        }
    }
    public  void plantStatus (){
        for (Plant plant : palnts ){
            plant.status();
        }
    }
}
