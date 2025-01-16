package Practice.Java8.DurgaPractice1.Session6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.prefs.PreferenceChangeEvent;

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
public class Lecture35
{
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        populate(list);

        //---- Predicate to check whether this employee is Manger or not:

        Predicate<Employee> p1 = emp->emp.designation.equals("Manager");

        //display(p1,list);
        //System.out.println(list);

        //---- Predicate to check Employees from banglore :
        Predicate<Employee> p2 = emp->emp.city.equals("Banglore");
        display(p2,list);

        //--- Predicate to check Employees-Salary<20000
        Predicate<Employee> p3 = e->e.salary<2000;

        for(Employee s : list)
        {
            if(p3.test(s))
            {

            }
        }

    }

    public static void display(Predicate<Employee> p, List<Employee> l)
    {
        for(Employee e1 : l)
        {
            if(p.test(e1))
            {
                System.out.println(e1);
            }
        }
    }
    public static void populate(List<Employee> list)
    {
        list.add(new Employee("Durga","CEO",30000,"Hyderabad"));
        list.add(new Employee("Sunny","Manager",20000,"Banglore"));
        list.add(new Employee("Mallika","Manager",2000,"Hyderbad"));
        list.add(new Employee("Aishwarya","Developer-1",900000,"Banglore"));
        list.add(new Employee("Karishma","Developer-1",900,"Banglore"));
    }


}
