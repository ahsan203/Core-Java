package Practice.records.John;

public class Test
{
    public static void main(String[] args) {

        EmployeeRecord emp1 = new EmployeeRecord("Ahsan",7027);
        EmployeeRecord emp2 = new EmployeeRecord("Shoeab",7018);
        EmployeeRecord emp3 = new EmployeeRecord("Ahsan",7027);

        System.out.println(emp1);
        System.out.println(emp2);

        System.out.println(emp1.equals(emp3));
    }
}
