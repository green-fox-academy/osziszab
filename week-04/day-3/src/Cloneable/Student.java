package Cloneable;

import org.omg.CORBA.Object;

public class Student extends Person  {

    String previousOrganization;
    int skippedDays;

    public Student(){
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    public Student(String name, int age, String gender, String previousOrganization){
        super(name,age,gender);
        this.previousOrganization = previousOrganization;
    }

    @Override
    public void getGoal(){
        System.out.println("Be a junior software developer.");
    }

    public void introduce(Student student){
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender +" from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays(int numberOfDays){
        skippedDays += numberOfDays;
    }
    public Student clone(){
        return new Student(name,age,gender,previousOrganization);
    }
}
