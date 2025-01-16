package Practice.Collection.Durgesh.Comparable_VS_Comparator.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmp {
    public static void main(String[] args) {

        List<Emp> emps = new ArrayList<>();
        emps.add(new Emp("Zaki","32142153",7035));
        emps.add(new Emp("Shoeab","324",7018));
        emps.add(new Emp("Ahsan","977",7027));

        System.out.println(emps);

        //---------- Comparable :

        Collections.sort(emps);
        System.out.println("Employee sorted with ID's " + emps);


    }
}
