package Practice.Collection.Durga;

import java.util.HashSet;
import java.util.Set;

public class Test10
{
    public static void main(String[] args) {

        Set hs1 = new HashSet();

        hs1.add("Ahsan");
        hs1.add("B");
        hs1.add("C");
        hs1.add("D");
        hs1.add("Z");
        hs1.add(null);
        hs1.add(10);

        System.out.println(hs1.add(null));

        System.out.println("Hash-Set (hs1) = " + hs1);

    }
}
