public class SecondsInADay {

    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int fullday=24*3600;
        int day=14*3600;
        int minutes=34*60;


        int result =fullday-(day+currentSeconds+minutes);
        System.out.println(result+"sec");


        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
    }


}
