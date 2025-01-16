package Practice.MultiThreading.Durga.Part3;

public class Example3 extends  Thread
{
    public static void main(String[] args)
    {
        Example3 ex3 = new Example3();
        ex3.start();
        System.out.println("MainCredit-Method is executed by Thread : "+Thread.currentThread().getName());

    }

    public void run()
    {
        System.out.println("run-Method is executed by Thread : "+Thread.currentThread().getName());
    }
}
