package animal;

public class Animal {

    static int basicValue = 50;
    int hunger = basicValue;
    int thrist = basicValue;

    public Animal(){
    }
    public void eat (){
        hunger--;
    }
    public void drink(){
        thrist--;
    }
    public void play(){
        hunger++;
        thrist++;
    }

}
