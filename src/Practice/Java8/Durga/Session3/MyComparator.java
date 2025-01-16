package Practice.Java8.Durga.Session3;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer>
{

    public int compare(Integer I1, Integer I2)
    {
        return (I1>I2) ? -1 : (I1<I2) ? 1 : 0;
    }
}
