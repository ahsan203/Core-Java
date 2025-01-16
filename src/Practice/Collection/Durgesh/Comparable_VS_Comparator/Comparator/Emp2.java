package Practice.Collection.Durgesh.Comparable_VS_Comparator.Comparator;

public class Emp2
{
    private String name;
    private String phone;
    private int empID;

    public Emp2() {
    }

    public Emp2(String name, String phone, int empID) {
        this.name = name;
        this.phone = phone;
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    @Override
    public String toString() {
        return "Emp2{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", empID=" + empID +
                '}';
    }


}
