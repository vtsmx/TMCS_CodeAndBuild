import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Main
{
    /**
     * Main method of programm
     * @param args xxx
     */
    public static void main(String[] args)
    {
        if (args.length != 2)
        {
            System.out.println("2 Arguments needed\nfirst parameter: sum|avg|min|max\nsecond parameter: values spperated with comma e.g. 10,3,5,6");
        }
        else
        {
            var values = new ArrayList<Integer>();

            for ( var value : args[1].split(",") )
            {
                values.add(Integer.parseInt(value));
            }

            switch (args[0])
            {
                case "sum": System.out.println("Sum: "+Mathematics.sumOfValues(values.toArray(Integer[]::new))); break;
                case "avg": System.out.println("Avg: "+Mathematics.avgOfValues(values.toArray(Integer[]::new))); break;
                case "min": System.out.println("Min: "+Mathematics.minOfValues(values.toArray(Integer[]::new))); break;
                case "max": System.out.println("Max: "+Mathematics.maxOfValues(values.toArray(Integer[]::new))); break;
                default: System.out.println("Unknown cmd: "+args[0]); break;
            }
        }
    }
}
