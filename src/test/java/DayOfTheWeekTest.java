import M8Homework.DayOfTheWeek;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DayOfTheWeekTest {

    @Test
    public void positiveNumber(){
        System.out.println("This is a positive test");
        String expectedResult = "Monday";
        String actualResult = DayOfTheWeek.getDay (2);
        String expectedResult1 = "Saturday";
        String actualResult1 = DayOfTheWeek.getDay(7);
        assertEquals(expectedResult, actualResult, "Monday is the number 2");
        assertEquals(expectedResult1, actualResult1, "Saturday is the number 7");

    }

    @Test
    public void negativeNum(){
        System.out.println("This is the negative test");
        String expectedResult = "The number should be equal or larger than 1";
        String actualResult = DayOfTheWeek.getDay(-5);
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void biggerNum(){
        System.out.println("This is the negative test");
        String expectedResult = "The number should be equal or smaller than 7";
        String actualResult = DayOfTheWeek.getDay(10);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("NullPointerException")
    public void errorTest(){
        assertThrows(NullPointerException.class, () -> {DayOfTheWeek.getDay(null);});
    }

}
