import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class MyUnitTest
{
    public static void main(String[] args)
    {
        System.out.println("Start testing");

        MyUnitTest myUnitTest = new MyUnitTest();

        //sum tests
        myUnitTest.tcSum1();
        myUnitTest.tcSum2();
        myUnitTest.tcSum3();

        //avg tests
        myUnitTest.tcAvg1();
        myUnitTest.tcAvg2();
        myUnitTest.tcAvg3();

        //min tests
        myUnitTest.tcMin1();
        myUnitTest.tcMin2();
        myUnitTest.tcMin3();

        //max tests
        myUnitTest.tcMax1();
        myUnitTest.tcMax2();
        myUnitTest.tcMax3();

        System.out.println("Finish testing");
    }

    @Test
    @DisplayName("Sum with positive numbers")
    public void tcSum1()
    {
        Integer[] values = {10,10,30};
        assertEquals(50, Mathematics.sumOfValues(values));
    }

    @Test
    @DisplayName("Sum with negative numbers")
    public void tcSum2()
    {
        Integer[] values = {-10,-10,-30};
        assertEquals(-50, Mathematics.sumOfValues(values));
    }

    @Test
    @DisplayName("Sum with mixed (positive and negative) numbers")
    public void tcSum3()
    {
        Integer[] values = {-10,10,-30};
        assertEquals(-30, Mathematics.sumOfValues(values));
    }

    @Test
    @DisplayName("Avg with positive numbers")
    public void tcAvg1()
    {
        Integer[] values = {10,10,30};
        assertEquals(16, Mathematics.avgOfValues(values));
    }

    @Test
    @DisplayName("Avg with negative numbers")
    public void tcAvg2()
    {
        Integer[] values = {-10,-10,-30};
        assertEquals(-16, Mathematics.avgOfValues(values));
    }

    @Test
    @DisplayName("Avg with mixed (positive and negative) numbers")
    public void tcAvg3()
    {
        Integer[] values = {-10,10,-30};
        assertEquals(-10, Mathematics.avgOfValues(values));
    }

    @Test
    @DisplayName("Min with positive numbers")
    public void tcMin1()
    {
        Integer[] values = {10,10,30};
        assertEquals(10, Mathematics.minOfValues(values));
    }

    @Test
    @DisplayName("Min with negative numbers")
    public void tcMin2()
    {
        Integer[] values = {-10,-10,-30};
        assertEquals(-30, Mathematics.minOfValues(values));
    }

    @Test
    @DisplayName("Min with mixed (positive and negative) numbers")
    public void tcMin3()
    {
        Integer[] values = {-10,10,-30};
        assertEquals(-30, Mathematics.minOfValues(values));
    }

    @Test
    @DisplayName("Max with positive numbers")
    public void tcMax1()
    {
        Integer[] values = {10,10,30};
        assertEquals(30, Mathematics.maxOfValues(values));
    }

    @Test
    @DisplayName("Max with negative numbers")
    public void tcMax2()
    {
        Integer[] values = {-10,-10,-30};
        assertEquals(-10, Mathematics.maxOfValues(values));
    }

    @Test
    @DisplayName("Max with mixed (positive and negative) numbers")
    public void tcMax3()
    {
        Integer[] values = {-10,10,-30};
        assertEquals(10, Mathematics.maxOfValues(values));
    }
}
