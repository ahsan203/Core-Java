package Practice.Collection.Ankit.Comparable_vs_Comparator.Durgesh.Comparator;

public class Employee
{
    String name;
    String age;
    int empId;

    public Employee(String name, String age, int empId) {
        this.name = name;
        this.age = age;
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
                ", age='" + age + '\'' +
                ", empId=" + empId +
                '}';
    }


}
