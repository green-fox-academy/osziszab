package Pirates;

public class Pirate {

    String name;
    boolean alive;
    boolean dead;
    boolean parrotpal;
    int intoxicates;

    public Pirate(){
        this.name = name;
        this.alive = true;
        this.dead = false;
        this.parrotpal = false;
        this.intoxicates = 0;
    }

    public void drinkSomeRum(){
        intoxicates++;
    }
    public void howsItGoingMate(){
        if (intoxicates<5){
            System.out.println("Pour me anudder!");
        }else{
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }
    }

}
