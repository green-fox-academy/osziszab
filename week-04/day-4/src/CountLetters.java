import java.util.HashMap;

public class CountLetters {

    public HashMap<Character,Integer> countLetters (String word){
        word.toLowerCase();
        HashMap<Character,Integer> dictionary = new HashMap<>();
        for( int i = 0; i < word.length(); i++){
            if(!dictionary.containsKey(word.charAt(i))){
                dictionary.put(word.charAt(i),1);
            }else{
                dictionary.put(word.charAt(i),dictionary.get(word.charAt(i))+1);
            }
        }
        return dictionary;
    }


}
