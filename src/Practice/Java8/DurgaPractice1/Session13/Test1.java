package Practice.Java8.DurgaPractice1.Session13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1
{
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(0);
        l.add(10);
        l.add(20);
        l.add(5);
        l.add(15);
        l.add(25);

        System.out.println(l);

        //--- List out all even numbers into new list without using Streams-concept :

        List<Integer> l1 = new ArrayList<>();

        for(Integer i : l)
        {
            if(i%2==0)
            {
                l1.add(i);
            }
        }

        System.out.println(l1);

       //--- Using Stream-concept

       List<Integer> l2 = l.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(l2);



        //---- I want a new list which has double-the value of elements of List l :

        List<Integer> l3 = new ArrayList<>();

        for(Integer i : l)
        {
            l3.add(i*2);
        }
        System.out.println(l3);

        //--- By using map() of Streams :
        List<Integer> l4 = l.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println(l4);
    }
}
