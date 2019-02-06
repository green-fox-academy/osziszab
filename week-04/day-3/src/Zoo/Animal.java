package Zoo;


public abstract class Animal {

    String name;
    int age;
    String gender;
    String color;
    String bloodtype;

    public Animal(String name, int age, String gender, String color, String bloodtype){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.color = color;
        this.bloodtype = bloodtype;
    }
    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract  String breed();
}
