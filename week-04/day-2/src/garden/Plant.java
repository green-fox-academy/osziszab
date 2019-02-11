package garden;

public class Plant {

    String color;
    double waterNeed;
    double waterAbsorbtion;

    public Plant(String color , int waterNeed, double waterAbsorbtion ){
        this.color = color;
        this.waterAbsorbtion = waterAbsorbtion;
    }

    public  void status(){
        if(waterNeed < 5){
            System.out.println("The " + color + " " + this.getClass() + " needs water.");
        } else {
            System.out.println("The " + color + " " + this.getClass() + " doesn't needs water.");
        }
    }
}
