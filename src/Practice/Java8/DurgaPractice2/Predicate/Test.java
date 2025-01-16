package Practice.Java8.DurgaPractice2.Predicate;

import Practice.Java8.DurgaPractice2.Employee;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test
{
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();
        populateList(list);

        System.out.println(list);
        System.out.println("--------------------");

        //---------- Predicate to check CEO or not
        Predicate<Employee> p1 = (employee)->(employee.getDesignation()).equals("CEO");
        display(p1,list);
        System.out.println("--------------------");

        //------- Prediacte to check employee's city is Hyderabad
        Predicate<Employee> p2 = (employee)-> employee.getCity().equals("Hyderabad");
        display(p2,list);
        System.out.println("--------------------");

        //----- Predicate to check employee's whose salary is less than 800000
        Predicate<Employee> p3 = employee -> employee.getSalary()<800000;
        display(p3,list);
        System.out.println("--------------------");

        //-------- Predicate to check employee is CTO and from Melbourne;
        Predicate<Employee> p4 = employee -> employee.getDesignation().equals("CTO");
        Predicate<Employee> p5 = employee -> employee.getCity().equals("Melbourne");
        display(p4.and(p5),list);
        System.out.println("-----------------");


        //------ Predicate to check who are not CEO
        display(p1.negate(),list);
    }

    public static void populateList(ArrayList<Employee> list)
    {
        list.add(new Employee("Ahsan","CEO",890000,"Chicago"));
       list.add(new Employee("Zaid","CTO",890000,"Chicago"));
        list.add(new Employee("Shoeab","CTO",789000,"Melbourne"));
        list.add(new Employee("Muzammil","COO",780000,"Hyderabad"));

    }

    public static void display(Predicate<Employee> p ,ArrayList<Employee> list)
    {
        for(Employee e : list)
        {
            if(p.test(e))
            {
                System.out.println(e);
            }
        }
    }
}
