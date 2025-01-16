package Practice.Collection.Durga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test11
{
    public static void main(String[] args) {

        Set lhs1 = new LinkedHashSet();

        lhs1.add("Ahsan");
        lhs1.add("B");
        lhs1.add("C");
        lhs1.add("D");
        lhs1.add("Z");
        lhs1.add(null);
        lhs1.add(10);

        System.out.println(lhs1.add(null));

        System.out.println("Linked-Hash-Set (lhs1) = " + lhs1);
    }

}
