package Practice.MultiThreading.Durga.Part4;

public class Example1 implements Runnable
{
    @Override
    public void run() {
        System.out.println("Child-Thread-Priority : " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args)
    {
        System.out.println("MainCredit-Thread-Priority : " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(7);
        System.out.println("MainCredit-Thread-Priority : " + Thread.currentThread().getPriority());

        Example1 ex1 = new Example1();
        Thread t1 = new Thread(ex1);
        t1.start();

    }
}
