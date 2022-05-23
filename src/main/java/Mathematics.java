public class Mathematics
{
    public static int sumOfValues(int[] values)
    {
        int sum = 0;

        for ( var value : values )
            sum += value;

        return sum;
    }
}
