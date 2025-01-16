package Practice.Collection.Ankit.Comparable_vs_Comparator.Durgesh.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1
{
    public static void main(String[] args) {

        List<String> names =  new ArrayList<>();

        names.add("zaki");
        names.add("ahsan");
        names.add("shoeab");
        names.add("zaid");
        names.add("job");
        names.add("gates");
        names.add("musk");

        System.out.println(names);

        Collections.sort(names);
        System.out.println(names);



    }
}
