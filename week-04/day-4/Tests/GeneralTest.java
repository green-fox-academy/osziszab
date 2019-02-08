import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class GeneralTest {

    @Test
    public void getAppleTest() {
        Apples alma = new Apples("apple");
        assertEquals("apple", alma.getApple("apple"));
    }

    @Test
    public void getAppleTest2() {
        Apples alma2 = new Apples("jonatan");
        assertEquals("apple", alma2.getApple("jonatan"));
    }

    @Test
    public void getAppleTest3() {
        Apples alma3 = new Apples("apple");
        assertEquals("apple", alma3.getApple("apple"));
    }

    //------------------------------------------------------------------------
    @Test
    public void sumOFElementsTest1(){
        List<Integer> elements = Arrays.asList(new Integer[]{5, -4, 3});
        Sum example1 = new Sum();
        assertEquals(4,example1.sumOFElements(elements));
    }

    @Test
    public void sumOFElementsTest2(){
        List<Integer> elements = Arrays.asList(new Integer[]{});
        Sum example1 = new Sum();
        assertEquals(null,example1.sumOFElements(elements));
    }

    @Test
    public void sumOFElementsTest3(){
        List<Integer> elements = new ArrayList<>();
        elements.add(4);
        Sum example1 = new Sum();
        assertEquals(4,example1.sumOFElements(elements));
    }
//-------------------------------------------------------------------------
    @Test
    public void isAnagramTest(){
        Anagram test = new Anagram();
        assertTrue(test.isAnagram("elbow","below"));
    }

    @Test
    public void isAnagramTest2(){
        Anagram test = new Anagram();
        assertFalse(test.isAnagram("elbog","below"));
    }
//-------------------------------------------------------------------------
    @Test
    public void countLettersTest (){
     CountLetters letters = new CountLetters();
     letters.countLetters("word");
        HashMap<Character, Integer> expectedMap = new HashMap<>();
        expectedMap.put('d', 1);
        expectedMap.put('l', 1);
        expectedMap.put('f', 2);
        expectedMap.put('o', 2);
        expectedMap.put('r', 3);
        expectedMap.put('w', 2);
        expectedMap.put('a', 2);
        expectedMap.put('c', 1);
        expectedMap.put('t', 1);

        assertEquals(expectedMap, letters.countLetters("worldofwarcraft"));

    }
}

