package Practice.Java8.DurgaPractice1.Session13;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Test2
{
    public static void main(String[] args) {

        List<String> l1 = new ArrayList<>();
        l1.add("Pavan");
        l1.add("RaviTeja");
        l1.add("Chiranjeevi");
        l1.add("Venkatesh");
        l1.add("Nagarjuna");

        System.out.println(l1);

        //--- Program to write list which contains object whose length is > 9
        List<String> l2= new ArrayList<>();

        l2 = l1.stream().filter(s->s.length()>=9).collect(Collectors.toList());
        System.out.println(l2);

        //-- Create a List with all UpperCase objects :
        List<String> l3 = l1.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
        System.out.println(l3);

        long count= l1.stream().filter(s->s.length()>=9).count();
        System.out.println("Number of objects which are greater than or equal to 9 = " + count);
    }
}
