import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void checkSum (){
        //given
        int value1 = 10;
        int value2 = 20;

        //when
        int actual = Main.sum(value1,value2);

        //then
        assertEquals(30,actual);
    }

    @Test
    public void testNumberGreaterThan100(){
        //given
        int number = 101;

        //when
        boolean actual = Main.checkNumberGreaterThan100(number);

        //then
        assertTrue(actual);
    }
    @Test
    public void testNumberSmallerThan100() {
        //given
        int number = 100;

        //when
        boolean actual = Main.checkNumberGreaterThan100(number);

        //then
        assertFalse(actual);
    }
}
