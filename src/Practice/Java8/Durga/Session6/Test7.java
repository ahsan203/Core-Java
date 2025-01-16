package Practice.Java8.Durga.Session6;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;

class Employee
{
    String name;
    String designation;
    double salary;
    String city;

    public Employee(String name, String designation,double salary,String city)
    {
        this.name=name;
        this.designation=designation;
        this.salary=salary;
        this.city=city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String toString()
    {
        return "(" + name + " who is a " + designation + " with " + salary + " salary," + " and a resident of " + city + ")" ;
    }

}


public class Test7
{
    public static void main(String[] args) {

        List<Employee> list = new CopyOnWriteArrayList<>();
        populate(list);

        System.out.println(list);
        System.out.println("-------------------------------------------------------------------");
        for(Employee e : list)
        {
            System.out.println(e);
        }
        System.out.println("-------------------------------------------------------------------");

//---------- Write a Predicate to print information of all Manager's only...

        System.out.println("\"Predicate to print information of all Manager's only\" : ");
        Predicate<Employee> p1 = m1 -> m1.getDesignation().equalsIgnoreCase("Manager");
        display(p1,list);

        System.out.println("-------------------------------------------------------------------");

//---------- Write a Predicate to print information of all Employee's who reside in Banglore...

        System.out.println(" \"Predicate to print info Employee's from Banglore City :  \" ");
        Predicate<Employee> p2 = m1 -> m1.getCity().equalsIgnoreCase("Banglore");
        display(p2,list);

        System.out.println("-------------------------------------------------------------------");
//--------- Predicate to list all Employee's whose salary<20,000

        System.out.println(" \"Predicate to list all Employee's whose salary<20,000 : \" ");
        Predicate<Employee> p3 = m1 -> m1.getSalary()<20000;
        display(p3,list);

        System.out.println("-------------------------------------------------------------------");

//--------- Predicate to remove all 'Managers' from 'Mumbai city :

        System.out.println(" \"Predicate to remove all 'Managers' from 'Mumbai city : \" " );
        Predicate<Employee> p4 = m1 -> m1.getDesignation().equalsIgnoreCase("Manager") && m1.getCity().equalsIgnoreCase("Mumbai");
        //display(p4,list);

        List<Employee> newList = remove(p4,list);
        System.out.println("Updated List of Employee's : ");
        for(Employee e : newList)
        {
            System.out.println(e);
        }

        System.out.println("-------------------------------------------------------------------");

//---------- Predicate to select all Employees who are Managers and salary<2000

        System.out.println(" \"Predicate to select all Employees who are Managers OR salary<2000 : \"  ");

        display((p1.or(p3)),list);

        System.out.println("-------------------------------------------------------------------");
//-------- Predicate to select all Employee's who are not Manger's
        System.out.println(" \" Predicate to select all Employee's who are not Manager's : \" ");

        display(p1.negate(),list);

    }

    public static void populate(List<Employee> al)
    {
        al.add(new Employee("Durga","CEO",40000,"Hyderabad"));
        al.add(new Employee("Sushmita","Manager",2000,"Mumbai"));
        al.add(new Employee("Mallika","Developer-1",900000,"Banglore"));
        al.add(new Employee("Kareena","Manager",3000,"Mumbai"));
        al.add(new Employee("Karina","Manager",2000,"Dubai"));
        al.add(new Employee("Aishwarya","Developer-1",900000,"Banglore"));
        al.add(new Employee("Karishma","Developer-1",900,"Banglore"));
    }

    public static void display(Predicate<Employee> p, List<Employee> list)
    {
        for(Employee e : list)
        {
            if(p.test(e))
            {
                System.out.println(e);
            }

        }
    }

    public static List<Employee>  remove(Predicate<Employee> p, List<Employee> empList)
    {
        for(Employee e : empList)
        {
            if(p.test(e))
            {
                empList.remove(e);
            }
        }

        return empList;
    }
}
