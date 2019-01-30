package counter;

public class Counter {

     int number;
     int newNumber;

    public Counter(){
        this.number = 0;
        this.newNumber=0;
    }
    public Counter (int number){
        this.number=number;
        this.newNumber=number;
    }
    public void add(int newNumber){
        number+=newNumber;
    }
    public void add(){
        number++;
    }
    public int get(){
        return number;
    }
    public void reset(){
        this.number=this.newNumber;
    }
}
