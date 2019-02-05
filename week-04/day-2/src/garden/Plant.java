package garden;

public class Plant {

    String color;
    int waterNeed;
    double waterAbsorbtion;

    public Plant(String color , int waterNeed, double waterAbsorbtion ){
        this.color = color;
        this.waterNeed = waterNeed;
        this.waterAbsorbtion = waterAbsorbtion;
    }
    public Plant(){
        this.color = "color";
        this.waterNeed = 0;
        this.waterAbsorbtion = 0;
    }
    public  void status(){

    }
}
