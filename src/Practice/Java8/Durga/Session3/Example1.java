package Practice.Java8.Durga.Session3;

import java.util.*;

public class Example1
{
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(0);
        l.add(15);
        l.add(5);
        l.add(20);

        System.out.println("Before-Sorting : " + l);

        Collections.sort(l);
        System.out.println("After-Sorting : " + l);

        Collections.sort(l,new MyComparator());
        System.out.println("Comparaotr : " + l);



        Collections.sort(l,(I1,I2) -> (I1>I2) ? -1 : (I1<I2) ? 1 : 0);
        System.out.println("Comparator-Lambda : " + l);


        System.out.println("----------------------------------------------------");
        System.out.println("-----------------------------------------------------");

        List<String> names = new ArrayList<>();
        names.add("Nomaan");
        names.add("Zaki");
        names.add("Hisham");
        names.add("Ahsan");

        System.out.println("Before -Sorting : " + names);

        Collections.sort(names,(s1,s2) -> s2.compareTo(s1));
        System.out.println("Comparator-Sorting : " + names);


        System.out.println("----------------------------------------------------");
        System.out.println("-----------------------------------------------------");


        Set<Integer> s = new TreeSet<>((i1,i2) -> (i1>i2) ? -1 : (i1<i2) ? 1 : 0);
        s.add(10);
        s.add(0);
        s.add(15);
        s.add(25);
        s.add(5);
        s.add(20);

        System.out.println("Tree-Comparator-Sorting : " + s);

        Set<String> names1 = new TreeSet<>((i1,i2) -> i1.compareTo(i2));
        names1.add("Zoro");
        names1.add("Zara");
        names1.add("Hyder");
        names1.add("Nomaan");
        names1.add("Kareem");
        names1.add("Lumda");

        System.out.println("Tree-Comparator-Sorting : " + names1);



        System.out.println("----------------------------------------------------");
        System.out.println("-----------------------------------------------------");


        Map<Integer,String> m = new TreeMap<>((i1,i2)-> (i1<i2) ? -1 : (i1>i2) ? 1 : 0);
        m.put(100,"Durga");
        m.put(600,"Sunny");
        m.put(300,"Bunny");
        m.put(200,"Chinny");
        m.put(700,"Vinny");
        m.put(400,"Pinny");

        System.out.println("Comparator Sorting : " +m);








    }
}
