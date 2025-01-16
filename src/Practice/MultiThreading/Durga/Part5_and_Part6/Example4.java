package Practice.MultiThreading.Durga.Part5_and_Part6;

public class Example4 extends Thread
{
    static Thread mt;

    public void run()
    {
        try {
            mt.join();
        }
        catch (InterruptedException e){ }

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

        Example4 ex4 = new Example4();
        Example4.mt=Thread.currentThread();

        ex4.start();
        ex4.join();

        for(int i=0; i<10; i++)
        {
            System.out.println("Parent-MainCredit-Thread....");
            Thread.sleep(2000);
        }
    }
}
