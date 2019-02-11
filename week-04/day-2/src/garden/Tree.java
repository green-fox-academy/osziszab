package garden;

public class Tree extends Plant {

    int numberOFTress;

    public Tree(int numberOFFlowers, String color, int waterNeed, double waterAbsorbtion){
        super(color , waterNeed, waterAbsorbtion);
        this.numberOFTress = numberOFFlowers;
        this.waterAbsorbtion = 0.40;
    }

}
