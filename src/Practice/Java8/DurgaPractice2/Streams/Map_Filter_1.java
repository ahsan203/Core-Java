package Practice.Java8.DurgaPractice2.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Map_Filter_1
{
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(0);l.add(10);l.add(20);l.add(5);l.add(15);l.add(25);l.add(20);l.add(5);
        System.out.println("List : " + l);

        //----- Using filter() to filter even numbers :
        List<Integer> evenList = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("Even-List : " + evenList);
        System.out.println("Distinct-Even_List : " + evenList.stream().distinct().collect(Collectors.toList()));

        //----- Using map() to produce new list by doubling values:
        List<Integer> doubleList = l.stream().map(i -> i * 2).collect(Collectors.toList());
        System.out.println("Doubling-List : " + doubleList);

        System.out.println("------------------------------------------------------");

        List<String> l2 = new ArrayList<>();
        l2.add("Pavan");l2.add("RaviTeja");l2.add("Chiranjeevi");l2.add("Venkatesh");l2.add("Nagarjuna");
        System.out.println("List-2 : " + l2);

        //----- Print list which objects length is >=9 ....
        List<String> List2_with_length_9 = l2.stream().filter(s -> s.length() >= 9).collect(Collectors.toList());
        System.out.println("List-2-modified : " + List2_with_length_9);

        //--------- List-2 in Upper case:
        List<String> l2_UpperCase = l2.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println("List-2_UpperCase : " + l2_UpperCase.stream().sorted().collect(Collectors.toList()));

        System.out.println("---------------------------------------------------------");

        //------------ Using count() on streams:
        long l2_count = l2.stream().count();
        System.out.println("l2_count : " + l2_count);

        long List2_with_9_count =  List2_with_length_9.stream().count();
        System.out.println("List2_with_9_count : " + List2_with_9_count);

        long l2_UpperCase_count = l2_UpperCase.stream().count();
        System.out.println("l2_uppercase_count : " + l2_UpperCase_count);


    }
}
