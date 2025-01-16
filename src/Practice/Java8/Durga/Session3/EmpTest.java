package Practice.Java8.Durga.Session3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpTest
{
    public static void main(String[] args) {

        Employee ahsan = new Employee("Ahsan",7027);
        Employee zaki = new Employee("Zaki",7035);
        Employee shoeab = new Employee("Shoeab",7018);

        List<Employee> l = new ArrayList<>();
        l.add(ahsan);
        l.add(zaki);
        l.add(shoeab);

        System.out.println("UnSorted : " + l);

        Collections.sort(l,(i1,i2) -> (i1.getEno()<i2.getEno()) ? -1 : (i1.getEno()> i2.getEno()) ? 1 : 0 );
        System.out.println("Sorted-byId : " +l);
    }
}
