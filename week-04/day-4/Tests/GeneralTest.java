import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
}
