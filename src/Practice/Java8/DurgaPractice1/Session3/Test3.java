package Practice.Java8.DurgaPractice1.Session3;

import java.util.Map;
import java.util.TreeMap;

public class Test3
{
    public static void main(String[] args) {

        Map<Integer,String> map1 = new TreeMap<>((i1,i2)->
        {
            if (i1>i2)
            {
                return -1;
            }
            else if(i1<i2)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        });
        map1.put(100,"Durga");
        map1.put(600,"Sunny");
        map1.put(300,"Bunny");
        map1.put(200,"Chinny");
        map1.put(700,"Vinny");
        map1.put(400,"Pinny");

        System.out.println("Customize Sorting Order = " + map1);
    }
}
