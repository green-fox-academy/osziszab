package garden;

public class Flower extends Plant {

    int numberOFFlowers;

    public Flower(int numberOFFlowers, String color, int waterNeed, double waterAbsorbtion){
        super(color , waterNeed, waterAbsorbtion);
        this.numberOFFlowers = numberOFFlowers;
        this.waterAbsorbtion = 0.75;
    }

    public  void status(){
        if(waterNeed < 5){
            System.out.println("The " + color + " Flower needs water.");
        }else {
                System.out.println("The " + color + " Flower doesn't needs water.");
        }
    }
}
