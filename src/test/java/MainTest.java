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
        int number1 = 111;
        int number2 = 2;

        //when

        //then
        assertTrue(Main.checkNumberGreaterThan100(number1));
        assertFalse(Main.checkNumberGreaterThan100(number2));
    }
}
