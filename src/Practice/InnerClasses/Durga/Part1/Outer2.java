package Practice.InnerClasses.Durga.Part1;

public class Outer2
{
    class Inner2
    {
        public void m1()
        {
            System.out.println("Inner-2 Class Method....");
        }
    }

    public static void main(String[] args) {


        Outer2 o2 = new Outer2();
        Outer2.Inner2 i2 = o2.new Inner2();
        i2.m1();

        System.out.println("Outer-class : " + o2.getClass().getName());
        System.out.println("Inner-class : " + i2.getClass().getName());
    }
}
