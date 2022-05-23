import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyUnitTest
{
    public static void main(String[] args)
    {
        System.out.println("Start testing");

        MyUnitTest myUnitTest = new MyUnitTest();

        myUnitTest.tcSum1();

        System.out.println("Finish testing");
    }

    @Test
    public void tcSum1()
    {
        int[] values = {10,10,30};
        assertEquals(50, Mathematics.sumOfValues(values));
    }
}
