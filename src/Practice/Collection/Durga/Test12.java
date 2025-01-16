package Practice.Collection.Durga;

import java.util.Set;
import java.util.TreeSet;

public class Test12
{
    public static void main(String[] args) {

        Set ts1 = new TreeSet();


        ts1.add("A");
        ts1.add("a");
        ts1.add("Z");
        ts1.add("L");
        ts1.add("B");
        //ts1.add(13);

        //ts1.add(null);------------> From 1.7 version null insertion is not allowed.

        System.out.println("Tree-Set (ts1) = " + ts1);

        System.out.println("-------------------------------------");

        Set ts2 = new TreeSet();

        ts2.add(new StringBuffer("A"));
        ts2.add(new StringBuffer("a"));
        ts2.add(new StringBuffer("Z"));
        ts2.add(new StringBuffer("L"));
        ts2.add(new StringBuffer("B"));

        System.out.println("Tree-Set (ts2) with StringBuffer = " + ts2);
    }
}
