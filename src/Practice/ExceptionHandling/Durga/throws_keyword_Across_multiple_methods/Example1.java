package Practice.ExceptionHandling.Durga.throws_keyword_Across_multiple_methods;

public class Example1
{
    public static void main(String[] args) throws InterruptedException
    {
        doStuff();
    }
    public static void doStuff() throws InterruptedException
    {
        doMoreStuff();
    }

    public static void doMoreStuff() throws InterruptedException
    {
        Thread.sleep(3000);
        System.out.println("Program executed successfully.");
    }
}
