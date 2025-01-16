package Practice.InnerClasses.Durga.Part2.Sub2;

public class Test
{

    public void m1()
    {
        class Inner
        {
            public void sum(int x,int y)
            {
                System.out.println("Sum : " + (x+y));
            }
        }

        Inner i = new Inner();
        i.sum(100,200);
        i.sum(2,3);
        i.sum(5,15);
    }

    public static void main(String[] args) {

        Test t = new Test();
        t.m1();
    }
}
