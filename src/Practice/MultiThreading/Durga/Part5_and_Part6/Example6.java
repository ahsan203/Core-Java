package Practice.MultiThreading.Durga.Part5_and_Part6;


public class Example6 extends Thread
{
    public void run()
    {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child-Thread....");
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException ie)
        {
            System.out.println("Child-Thread got interrupted!!!");
        }
    }

    public static void main(String[] args) {

        Example6 ex6 = new Example6();
        ex6.start();
        ex6.interrupt();

        System.out.println("End of MainCredit-Thread....");
    }
}
