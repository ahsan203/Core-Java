package Practice.Collection.Durgesh.Comparable_VS_Comparator.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmp
{
    public static void main(String[] args) {

        List<Emp2> emp = new ArrayList<>();
        emp.add(new Emp2("Zaki","987645638",7035));
        emp.add(new Emp2("Shoeab","988-500-3216",7018));
        emp.add(new Emp2("Ahsan","201-982-3527",7027));

        System.out.println("Unsorted : " + emp);

        System.out.println("----------------------------------------------");
        //Collections.sort(emp,(o1, o2) -> o1.getEmpID()-o2.getEmpID() );
        Collections.sort(emp,(o1,o2)->
        {
            return (o1.getEmpID()<o2.getEmpID())?1:(o1.getEmpID()>o2.getEmpID())?-1:0;
        });
        System.out.println("Sorted by ID : " + emp);

        Collections.sort(emp,(o1,o2)-> (o1.getName()).compareTo(o2.getName()));
        System.out.println("Sorted By Name : " + emp);

        /*Collections.sort(emp,new IdComparator());
        System.out.println("Sorted by ID : " + emp);

        Collections.sort(emp,new NameComparator());
        System.out.println("Sorted By Name : " + emp);*/

    }
}
