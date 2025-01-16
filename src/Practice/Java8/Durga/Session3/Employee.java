package Practice.Java8.Durga.Session3;

public class Employee
{
    private String name;
    private int eno;

    public Employee(String name, int eno)
    {
        this.name = name;
        this.eno = eno;
    }

    public String getName()
    {
        return name;
    }

    public int getEno() {
        return eno;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", eno=" + eno +
                '}';
    }
}
