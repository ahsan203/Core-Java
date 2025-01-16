package Practice.Collection.Ankit.Comparable_vs_Comparator.Durgesh.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeDemo
{
    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();


        emp.add(new Employee("ahsan","37",7027));
        emp.add(new Employee("shoeab","28",7018));
        emp.add(new Employee("zaki","29",7035));
        emp.add(new Employee("nomaan","40",7040));
        emp.add(new Employee("nomaan","41",7041));
        emp.add(new Employee("muzammil","52",7014));

        System.out.println(emp);

        System.out.println(" Sorting Emloyee's by Age : ");
        Collections.sort(emp,new AgeComparator());
        System.out.println(emp);
        emp.sort(Comparator.comparing(Employee::getAge));
        System.out.println(emp);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");


        System.out.println(" Sorting Employee's by name : ");
        Collections.sort(emp,new nameComparator());
        System.out.println(emp);
        emp.sort(Comparator.comparing(Employee::getName));
        System.out.println(emp);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println(" Sorting Employee's by Id's : ");
        Collections.sort(emp,new IdComparator());
        System.out.println(emp);
        emp.sort(Comparator.comparing(Employee::getEmpId));
        System.out.println(emp);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");

        System.out.println(" Sorting Employee's by name & age");
        emp.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getAge));
        System.out.println(emp);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Sorting Employee's by name & Id");
        emp.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getEmpId));
        System.out.println(emp);

    }
}
