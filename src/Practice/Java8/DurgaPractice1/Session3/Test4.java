package Practice.Java8.DurgaPractice1.Session3;

import Practice.Collection.Durgesh.Comparable_VS_Comparator.Comparable.Emp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test4
{
    public static void main(String[] args) {

        List<Employee> l1 = new ArrayList<Employee>();
        l1.add(new  Employee(200,"Deepika"));
        l1.add(new Employee(400,"Sunny"));
        l1.add(new Employee(300,"Mallika"));
        l1.add(new Employee(100,"Katrina"));

        System.out.println("Before Sorting = " + l1);

        Collections.sort(l1,(e1,e2)->{
        if(e1.getEno()>e2.getEno())
        {
            return -1;
        }
        else if(e1.getEno()<e2.getEno())
        {
            return 1;
        }
        else
        {
            return 0;
        }});

        System.out.println("After Sorting = " + l1);
    }
}


