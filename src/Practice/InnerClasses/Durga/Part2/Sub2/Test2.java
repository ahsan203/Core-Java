package Practice.InnerClasses.Durga.Part2.Sub2;

public class Test2
{
    int x=10;
    static int y = 20;

    public void m1()
    {
        class Inner1
        {
            public void innerM1()
            {
                System.out.println(Test2.this.x);
                System.out.println(Test2.this.y);
            }
        }
        Inner1 inner1 = new Inner1();
        inner1.innerM1();
    }


    public static void main(String[] args) {

        Test2 t1 = new Test2();
        t1.m1();
    }


}
