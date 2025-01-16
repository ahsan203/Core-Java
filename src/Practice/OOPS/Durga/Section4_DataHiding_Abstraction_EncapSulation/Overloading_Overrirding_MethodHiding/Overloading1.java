package Practice.OOPS.Durga.Section4_DataHiding_Abstraction_EncapSulation.Overloading_Overrirding_MethodHiding;

class Parent
{
    public int add(int a, int c)
    {
        int sum;
        sum = a + c;

        return sum;
    }

    public double add(double a, double c)
    {
        double area = a*c;
        return area;
    }
}
public class Overloading1
{
    public static void main(String[] args) {

        Parent p1 = new Parent();
        System.out.println(p1.add(12.3,23.4));

    }
}
