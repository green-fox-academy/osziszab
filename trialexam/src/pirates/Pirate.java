package pirates;

public class Pirate {

    String name;
    int gold;
    int healthPoints;
    boolean captain;
    boolean woodenLeg;

    public Pirate(String name, boolean captain, boolean woodenLeg){
        this.name = "name";
        this.gold = 10;
        this.healthPoints = 10;
        this.captain = false;
        this.woodenLeg = false;
    }
    public String work(){
        if (captain==true) {
            gold += 10;
            healthPoints -= 5;
        }else {
            gold++;
            healthPoints--;
        }
         if(woodenLeg==true){
             return "Hello, I'm Jack. I have a wooden leg and 20 golds.";
         }else {
             return "Hello, I'm Jack. I still have my real legs and 20 golds.";
         }
    }
    public String party (){
        if(captain==true){
            healthPoints += 10;
        }else{
            healthPoints++;
        }
        if(woodenLeg==true){
            return "Hello, I'm Jack. I have a wooden leg and 20 golds.";
        }else{
            return "Hello, I'm Jack. I still have my real legs and 20 golds.";
        }
    }

}
