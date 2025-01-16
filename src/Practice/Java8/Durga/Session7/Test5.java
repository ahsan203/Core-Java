package Practice.Java8.Durga.Session7;

import Practice.Collection.Durgesh.Comparable_VS_Comparator.Comparable.Emp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee
{
    String name;
    double salary;

    Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Test5
{
    public static void main(String[] args) {

        System.out.println(" \" Program to find Total Monthly Salary of all Employees by using Function : \" ");

        List<Employee> list = new ArrayList<>();
        populate(list);

        System.out.println("Employee List : ");
        for(Employee e1 : list)
        {
            System.out.println(e1);
        }

        System.out.println("---------------------------------------------------");

        Function<List<Employee>,Double> f1 = emp ->
        {
            double count=0;

            for(Employee e2 : list)
            {
                count = count +  e2.getSalary();
            }

            return count;
        };
        System.out.println("Total Salary of all Employees : " + f1.apply(list));

        System.out.println("----------------------------------------------------------");
        System.out.println(" \"Program to perform Salary Increment for Employees whose salary<3500 to $3977 by using Predicate & Function  : \" ");

        Predicate<Employee> p1 = emp2 -> emp2.getSalary()<3500;

        Function<Employee,Double> f2 = emp3 ->
        {
            double sal = emp3.getSalary();
            double increment = sal + 477;

            return increment;
        };

        ArrayList<Employee> list2 = new ArrayList<>();
        for(Employee e : list)
        {
            if(p1.test(e))
            {
                f2.apply(e);
            }
        }
        System.out.println("---------------------------------------------------------");

        System.out.println("Updated Salaries : ");
        for(Employee e : list)
        {
            System.out.println(e);
        }

    }

    public static void populate(List<Employee> l)
    {
        Employee sunny = new Employee("Sunny",1000);
        Employee bunny = new Employee("Bunny",2000);
        Employee chinny = new Employee("Chinny",3000);
        Employee pinny= new Employee("Pinny",4000);
        Employee vinny = new Employee("Vinny",5000);

        l.add(sunny);
        l.add(bunny);
        l.add(chinny);
        l.add(pinny);
        l.add(vinny);
    }
}
