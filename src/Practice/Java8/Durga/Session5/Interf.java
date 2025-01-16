package Practice.Java8.Durga.Session5;

public interface Interf
{
   // public static final int i =10;
   public abstract void m1();

    default void m2()
    {
        System.out.println("default-method().");
    }
}
class Test implements Interf
{

    public void m1()
    {
        System.out.println("My own Implementation.");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.m2();
        t.m1();

    }
}

