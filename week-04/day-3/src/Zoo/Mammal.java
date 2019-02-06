package Zoo;

public class Mammal extends Animal {

    String furrColor;

    public Mammal (String name){
        super( name);
    }

    @Override
    public String breed() {
        return "pushing miniature versions out.";
    }


}
