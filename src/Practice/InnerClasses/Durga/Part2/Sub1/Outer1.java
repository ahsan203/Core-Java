package Practice.InnerClasses.Durga.Part2.Sub1;

public class Outer1
{
    int x=10;
    static int y=20;


    class Inner1
    {
        public void m1()
        {
            System.out.println(x);
            System.out.println(y);
        }


    }

    public static void main(String[] args) {

       Outer1 out1 =  new Outer1();
       Outer1.Inner1 i1 = out1.new Inner1();
       i1.m1();
       //out1.new Inner1().m1();
    }
}
