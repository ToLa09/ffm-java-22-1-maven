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
    @Test
    public void faculty0Is1(){
        // given
        int number = 0;

        // when
        int actual = Main.faculty(number);

        // then
        int expected = 1;
        assertEquals(expected, actual);
    }
   @Test
    public void faculty1Is1() {
        // given
        int number = 1;

        // when
        int actual = Main.faculty(number);

        // then
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void faculty2Is2() {
        // given
        int number = 2;

        // when
        int actual = Main.faculty(number);

        // then
        int expected = 2;
        assertEquals(expected, actual);
    }
    @Test
    public void faculty3Is6() {
        // given
        int number = 3;

        // when
        int actual = Main.faculty(number);

        // then
        int expected = 6;
        assertEquals(expected, actual);
    }
    @Test
    public void faculty10IsBig() {
        // given
        int number = 10;

        // when
        int actual = Main.faculty(number);

        // then
        int expected = 3628800;
        assertEquals(expected, actual);
    }
}
