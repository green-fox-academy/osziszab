package Zoo;

public class Bird extends Animal {

    int wingSize;

    public Bird (String name,){
        super(name);


    }

    @Override
    public String breed() {
        return "laying eggs.";
    }
}
