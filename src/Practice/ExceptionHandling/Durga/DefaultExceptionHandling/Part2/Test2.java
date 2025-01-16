package Practice.ExceptionHandling.Durga.DefaultExceptionHandling.Part2;

public class Test2
{
    public static void main(String[] args) {
        doStuff();
        System.out.println(10/0);
        System.out.println("Ahsan Shareef Mohammed");
    }
    public static void doStuff()
    {
        doMoreStuff();
    }
    public static  void doMoreStuff()
    {
        System.out.println("Hello");
    }
}
