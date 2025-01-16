package Practice.MultiThreading.Durga.Part5_and_Part6;

public class Example1 extends Thread
{
    public void run()
    {

        Thread.currentThread().setPriority(10);
        for(int i=0; i<=10; i++)
        {
            System.out.println("Child-Thread...");
            Thread.yield();

        }

        System.out.println("Child-Thread-Priority : " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) throws Exception{

        Example1 ex1 = new Example1();
        ex1.start();


        for(int i=0; i<=10; i++)
        {
            System.out.println("MainCredit-Thread...");
        }

        System.out.println("MainCredit-Thread-Priority : " + Thread.currentThread().getPriority());

    }
}
