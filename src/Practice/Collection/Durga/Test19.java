package Practice.Collection.Durga;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class Test19
{
    public static void main(String[] args) {

        Integer I1 = new Integer(10);
        Integer I2 = new Integer(10);

        Map hm = new HashMap();

        hm.put(I1,"pawan");
        hm.put(I2,"kalyan");

        System.out.println("HashMap uses .equals() to check keys = " + hm);

        Map hm1 = new IdentityHashMap();

        hm1.put(I1,"pawan");
        hm1.put(I2,"kalyan");

        System.out.println("IdentityHashMap uses == operator to check keys = " + hm1);


    }
}
