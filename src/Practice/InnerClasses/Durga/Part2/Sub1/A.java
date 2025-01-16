package Practice.InnerClasses.Durga.Part2.Sub1;

public class A
{
    class B
    {
        class C
        {
            public void m1()
            {
                System.out.println("C-Inner-Class");
            }
        }
    }

    public static void main(String[] args) {

        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();

        c.m1();


        new A().new B().new C().m1();
    }
}
