import java.util.*;

public class Anagram {


    public boolean isAnagram (String firstWord, String secondWord){
        boolean result = false;
        List<Character> letterOfFirstWord = new ArrayList<>();
        List<Character> letterOfSecondWord = new ArrayList<>();

        //char[] myCharArray = firstWord.toCharArray();
        //Arrays.sort(myCharArray);

        for ( int i= 0; i < firstWord.length(); i++){
            letterOfFirstWord.add(firstWord.charAt(i));
        }
        for ( int i= 0; i < secondWord.length(); i++){
            letterOfSecondWord.add(secondWord.charAt(i));
        }

        Collections.sort(letterOfFirstWord);
        Collections.sort(letterOfSecondWord);

        if (letterOfFirstWord.equals(letterOfSecondWord)){
            result=true;
            return result;
        }else{
            return result;
        }
    }
}
