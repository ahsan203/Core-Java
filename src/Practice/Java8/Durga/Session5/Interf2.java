package Practice.Java8.Durga.Session5;

public interface Interf2
{
    public static void m1()
    {
        System.out.println("Interf Static method....");
    }

}

class Test2 implements Interf2
{
    public static void main(String[] args) {

        Test2 t = new Test2();

        Interf2.m1();
    }


}
