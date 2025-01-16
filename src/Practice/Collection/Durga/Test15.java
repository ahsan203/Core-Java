package Practice.Collection.Durga;

import Practice.Java8.Durga.Session3.MyComparator;

import java.util.Comparator;
import java.util.TreeSet;

public class Test15
{
    public static void main(String[] args) {

        TreeSet t = new TreeSet<>(new MyComparator2());

        t.add("Roja");
        t.add("Shobha Rani");
        t.add("RajaKumari");
        t.add("GangaBhavani");
        t.add("Ramulamma");

        System.out.println("Tree-Set (t) Alphabetical-order = " + t);
    }
}

class MyComparator2 implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
        String s1 = (String) obj1;
        String s2 = (String) obj2;

        return -s1.compareTo(s2);
    }
}