package Practice.MultiThreading.Durga.Part5_and_Part6;

public class Example7 extends Thread
{
    public void run()
    {
        for(int i=0; i<500; i++)
        {
            System.out.println("Child-Thread-"+ i);
        }
        System.out.println("I am entering into Sleeping state.");

        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException ie)
        {
            System.out.println("I got Interrupted!");
        }
    }

    public static void main(String[] args) {
        Example7 ex7 = new Example7();
        ex7.start();
        ex7.interrupt();

        System.out.println("End of MainCredit-Thread...");
    }
}
