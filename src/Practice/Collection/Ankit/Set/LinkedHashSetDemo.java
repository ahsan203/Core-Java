package Practice.Collection.Ankit.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo 
{
    public static void main(String[] args) {
        Set lhs =  new LinkedHashSet();

        System.out.println(lhs.isEmpty());

        lhs.add("A");
        lhs.add("C");
        lhs.add("R");
        lhs.add("C");
        System.out.println(lhs.add("C"));
        lhs.add(null);
        lhs.add("F");
        lhs.add("0");

        System.out.println(lhs);
    }
}
