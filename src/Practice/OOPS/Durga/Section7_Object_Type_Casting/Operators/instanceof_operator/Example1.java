package Practice.OOPS.Durga.Section7_Object_Type_Casting.Operators.instanceof_operator;

public class Example1 extends Thread
{
    public static void main(String[] args)
    {
        Thread t = new Thread();
        Object o1 = new Object();
        System.out.println(t instanceof Thread);

        System.out.println(t instanceof Object);

        System.out.println(t instanceof Runnable);

        System.out.println(null instanceof Thread);

        System.out.println(o1 instanceof Thread);
        System.out.println("------------------");

        String s = "Ahsan";
        Object o2 = new Object();

        System.out.println(s instanceof String);
        System.out.println(s instanceof Object);
       // System.out.println(t instanceof  String);
        System.out.println(o2 instanceof String);

    }
}
