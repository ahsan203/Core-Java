package Practice.MultiThreading.Durga.Part2;

public class Example1 extends Thread
{
    public static void main(String[] args)
    {
        System.out.println("MainCredit-Thread started...");

        Example1 ex1 = new Example1();
        //ex1.run();
        ex1.start();

        for(int i=0;i<10;i++)
        {
            System.out.println("MainCredit-Thread");
            try {
                Thread.sleep(3000);
            }
            catch (InterruptedException e)
            {
                e.toString();

            }
        }
    }

    public void run()
    {
        System.out.println("Child-Thread started...");
        for(int i=0; i<=10; i++)
        {
            System.out.println("Child-Thread");
            try {
                Thread.sleep(3000);
            }
            catch (InterruptedException e)
            {
                e.toString();

            }
        }
    }
}
