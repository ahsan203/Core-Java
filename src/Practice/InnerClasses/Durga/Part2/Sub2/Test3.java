package Practice.InnerClasses.Durga.Part2.Sub2;

public class Test3
{
    int x =101;
    static  int y = 201;

    public static void m1()
    {

        class Inner
        {
            public void innerM1()
            {
                Test3 t = new Test3();
              //  System.out.println(Test3.this.x);
                System.out.println(t.x);
                System.out.println(Test3.y);

            }
        }
        Inner i1 = new Inner();
        i1.innerM1();
    }

    public static void main(String[] args) {

        Test3 t = new Test3();
        Test3.m1();

    }

}
