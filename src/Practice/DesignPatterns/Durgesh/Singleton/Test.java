package Practice.DesignPatterns.Durgesh.Singleton;

public class Test
{
    public static void main(String[] args) {


        Student ahsan = Student.getStudent();
        System.out.println(ahsan.hashCode());

        Student shoeab = Student.getStudent();
        System.out.println(shoeab.hashCode());

        Student zaki = Student.getStudent();
        System.out.println(zaki.hashCode());
    }
}
