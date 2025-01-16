package Practice.Collection.Durgesh.Comparable_VS_Comparator.Example1;

import Practice.InnerClasses.Durga.Part2.Sub1.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample
{
    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(12);
        marks.add(34);
        marks.add(6);

        System.out.println(marks);

        Collections.sort(marks);
        System.out.println("Sorted List : " + marks);


        List<String> friends = new ArrayList<>();
        friends.addAll(List.of("Shoeab","Hisham","Rana","Ismail","Muzammil","Nomaan","Zaid"));
        System.out.println("SHRIMNZ : " + friends);

        Collections.sort(friends);
        System.out.println("Sorted-SHRIMNZ : " + friends);
    }
}
