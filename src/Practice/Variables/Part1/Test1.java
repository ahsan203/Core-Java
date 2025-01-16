package Practice.Variables.Part1;

public class Test1
{
    int x =10;
    static int y = 20;
    static int a =50;

    public static void m1()
    {
        Test1 t1 = new Test1();
        System.out.println(t1.x);
    }

    public static void m2()
    {
        Test1 t2 = new Test1();
        int z = t2.x +y;

        System.out.println("Sum : " + z);
    }

    public void m3()
    {
        System.out.println(a);
    }

    public static void main(String[] args) {

        m1();
        m2();

        Test1 t1 = new Test1();
        t1.m3();
    }
}
