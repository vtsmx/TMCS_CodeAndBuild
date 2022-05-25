public class Mathematics
{
    /**
     * calculates the sum of the given values
     * @param values values
     * @return the sum of the given values
     */
    public static Integer sumOfValues(Integer[] values)
    {
        int sum = 0;

        for ( var value : values )
            sum += value;

        return sum;
    }

    /**
     * calculates the average of the given values
     * @param values values
     * @return the average of the given values
     */
    public static Integer avgOfValues(Integer[] values)
    {
        int sum = 0;

        for ( var value : values )
            sum += value;

        return sum/values.length;
    }

    /**
     * calculate the max value of the given values
     * @param values values
     * @return return the max value of the given values
     */
    public static Integer maxOfValues(Integer[] values)
    {
        Integer max = null;

        if ( values.length > 0 )
            max = values[0];

        for ( var value : values )
        {
            if ( value > max )
                max = value;
        }

        return max;
    }

    /**
     * calculate the min value of the given values
     * @param values values
     * @return return the min value of the given values
     */
    public static Integer minOfValues(Integer[] values)
    {
        Integer min = null;

        if ( values.length > 0 )
            min = values[0];

        for ( var value : values )
        {
            if ( value < min )
                min = value;
        }

        return min;
    }
}
