package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    List<Plant> palnts;

    public Garden(){
        this.palnts = new ArrayList<>();
        Flower flower1 = new Flower();
        Flower flower2 = new Flower();
        Tree tree1 = new Tree();
        Tree tree2 = new Tree();
        palnts.add(flower1);
        palnts.add(flower2);
        palnts.add(tree1);
        palnts.add(tree2);
    }

    public void giveWater(int water, List<Flower>flowers, List<Tree>trees){
        int sumOfPlants = flowers.size() + trees.size();
        int amountWater = water/sumOfPlants;
    }
    public  void plantStatus (){
        for (Plant plant : palnts ){
            plant.status();
        }
    }
}
