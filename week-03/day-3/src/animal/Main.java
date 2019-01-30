package animal;

public class Main {
    public static void main(String[] args) {

    /*    Create an Animal class
        Every animal has a hunger value, which is a whole number
        Every animal has a thirst value, which is a whole number
        when creating a new animal object these values are created with the default 50 value
        Every animal can eat() which decreases their hunger by one
        Every animal can drink() which decreases their thirst by one
        Every animal can play() which increases both by one
    */
        Animal horse = new Animal();
        Animal goat = new Animal();
        Animal lion = new Animal();

        lion.eat();
        goat.drink();
        horse.play();
        horse.play();

        System.out.println("Lions hunger: "+lion.hunger);
        System.out.println("Goats thirts: "+goat.thrist);
        System.out.println("Horse hunger and thirst: "+horse.hunger+ " "+horse.thrist);


    }
}
