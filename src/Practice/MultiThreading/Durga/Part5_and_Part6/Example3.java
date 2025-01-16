package Practice.MultiThreading.Durga.Part5_and_Part6;

public class Example3 extends Thread
{
    static Thread mt;

    public void run()
    {
        try {
            mt.join();
        }
        catch (InterruptedException e)
        {

        }

        for(int i=0; i<10; i++)
        {
            System.out.println("Child-Thread.....");
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {

            }
        }
    }

    public static void main(String[] args) throws InterruptedException{
        Example3 ex3 = new Example3();
        ex3.start();

        Example3.mt=Thread.currentThread();

        for(int i=0; i<10; i++)
        {
            System.out.println("Parent-MainCredit-Thread....");
            Thread.sleep(2000);
        }
    }
}
