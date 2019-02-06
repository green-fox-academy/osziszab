package Cloneable;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Jhon",20,"male", "BME");
        Student JohnTheClone = student1.clone();
        JohnTheClone.introduce();
    }
}
