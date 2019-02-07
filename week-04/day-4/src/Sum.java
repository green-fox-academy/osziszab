import java.util.ArrayList;
import java.util.List;

public class Sum {

    List<Integer> elements;

    public Sum (){
        this.elements = new ArrayList<>();
    }

    public int sumOFElements(List<Integer> elements){
        int sumOfElements = 0;
        for (int i = 0; i <elements.size(); i++ ){
            sumOfElements += elements.get(i);
        }
        return sumOfElements;
    }
}
