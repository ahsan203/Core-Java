package Practice.MultiThreading.Durga.Part4;

public class Example2 extends Thread
{
    @Override
    public void run() {
        for(int i=0; i<=10; i++)
        {
            System.out.println("Child-Thread");

        }
    }

    public static void main(String[] args) {

        Example2 ex2 = new Example2();
        ex2.setPriority(10);
        ex2.start();

        for(int i=0; i<=10; i++)
        {
            System.out.println("MainCredit-Thread.");
        }
    }
}
