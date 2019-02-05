package garden;

public class Tree extends Plant {

    int numberOFTress;

    public Tree(int numberOFFlowers, String color, int waterNeed, double waterAbsorbtion){
        super(color , waterNeed, waterAbsorbtion);
        this.numberOFTress = numberOFFlowers;
    }
    public Tree(){
        this.numberOFTress = 0;
        this.waterAbsorbtion = 0.40;
        this.waterNeed = 10;
    }

    public  void status(){
        if(waterNeed < 10){
            System.out.println("The " + color + " Tree needs water.");
        }else{
            System.out.println("The " + color + " Tree doesn't needs water.");
        }
    }
}
