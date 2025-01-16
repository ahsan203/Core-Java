package Practice.Collection.Durga;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class Test20
{
    public static void main(String[] args) {

        System.out.println("HashMap v/s WeakHashMap : ");
        System.out.println("--------------------------");

        Map hm1 = new HashMap();

        Temp t1 = new Temp();

        hm1.put(t1,"durga");
        System.out.println(hm1);

        t1=null;

        System.gc();
        System.out.println(hm1);

        System.out.println("----------------------------------------");

        Map hm2 = new WeakHashMap();

        Temp t2 = new Temp();

        hm2.put(t2,"durga");
        System.out.println(hm2);

        t2=null;

        System.gc();
        System.out.println(hm2);

    }
}

class Temp
{
    public String toString()
    {
        return "temp";
    }

    public void finalize()
    {
        System.out.println("finalize() is called...");
    }
}
