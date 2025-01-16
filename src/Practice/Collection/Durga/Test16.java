package Practice.Collection.Durga;

import java.util.Comparator;
import java.util.TreeSet;

class Employee16 implements Comparable
{
    String name;
    int empId;

    public Employee16(String name, int empId)
    {
        this.name = name;
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                '}';
    }

    public int compareTo(Object obj1)
    {
        int eid1 = this.empId;

        Employee16 e = (Employee16) obj1;
        int eid2 = e.empId;

        if(eid1>eid2)
        {
            return -11;
        }
        else if(eid2>eid1)
        {
            return 11;
        }
        else
        {
            return 0;
        }
    }
}



public class Test16
{
    public static void main(String[] args) {
        Employee16 ahsan = new Employee16("ahsan",7027);
        Employee16 shoeab = new Employee16("shoeab",7018);
        Employee16 zaki = new Employee16("zaki",7035);

        TreeSet t1 = new TreeSet();
        t1.add(ahsan);
        t1.add(shoeab);
        t1.add(zaki);

        System.out.println("DNSO = " + t1);

        System.out.println("---------------------");

        TreeSet t2 = new TreeSet(new MyComparator16());
        t2.add(ahsan);
        t2.add(shoeab);
        t2.add(zaki);

        System.out.println("Customized-Sorting = " + t2);
    }
}

class MyComparator16 implements Comparator
{
    public int compare(Object obj1,Object obj2)
    {
        Employee16 e1 = (Employee16) obj1;
        Employee16 e2 = (Employee16) obj2;

        String s1 = e1.name;
        String s2 = e2.name;

        return s2.compareTo(s1);
    }
}