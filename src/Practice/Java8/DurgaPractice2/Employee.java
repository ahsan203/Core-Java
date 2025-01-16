package Practice.Java8.DurgaPractice2;

public class Employee
{
    private String ename;
    private String designation;
    private double salary;
    private String city;

    public Employee(String ename, String designation, double salary, String city) {
        this.ename = ename;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }

    public Employee() {
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
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

    @Override
    public String toString() {
        return "Employee{" +
                "ename='" + ename + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                '}';
    }
}
