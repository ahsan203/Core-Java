package Practice.Collection.Ankit.Comparable_vs_Comparator.Durgesh.Comparable;

public class Employee implements Comparable<Employee>
{
    String name;
    String age;
    int empId;

    public Employee(String name, String phone, int empId) {
        this.name = name;
        this.age = phone;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public int getEmpId() {
        return empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phone='" + age + '\'' +
                ", empId=" + empId +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.age.compareTo(o.age);
    }
}
