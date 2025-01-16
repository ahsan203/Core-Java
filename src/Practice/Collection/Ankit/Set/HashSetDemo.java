package Practice.Collection.Ankit.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo
{
    public static void main(String[] args) {

        Set hs =  new HashSet();

        System.out.println(hs.isEmpty());

        hs.add("A");
        hs.add("C");
        hs.add("R");
        hs.add("C");
        System.out.println(hs.add("C"));
        hs.add(null);
        hs.add("F");
        hs.add("0");

        System.out.println(hs);


    }
}
