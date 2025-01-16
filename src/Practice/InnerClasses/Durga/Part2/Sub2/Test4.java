package Practice.InnerClasses.Durga.Part2.Sub2;

public class Test4
{
    public void m1()
    {
       final int x = 11;

        class Inner
        {
            int x =13;
            public void innerM1()
            {
                System.out.println(x);
            }
        }
        Inner i1 = new Inner();
        i1.innerM1();
    }

    public static void main(String[] args) {

        Test4 t = new Test4();
        t.m1();
    }
}
