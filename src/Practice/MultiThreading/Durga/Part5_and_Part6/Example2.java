package Practice.MultiThreading.Durga.Part5_and_Part6;

public class Example2 extends Thread
{
    public void run()
    {

        for(int i=0; i<=10; i++)
        {
            System.out.println("Robins-Thread...");
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        Example2 ex2 = new Example2();
        ex2.start();

        try {
            ex2.join();
        }
        catch(InterruptedException e)
        {

        }
        for(int i=0; i<=10; i++)
        {
            System.out.println("Batman's Thread...");
        }
    }
}
