package Practice.InnerClasses.Durga.Part3;

class MyRunnable implements Runnable
{
    @Override
    public void run() {
        for(int i=0; i<10; i++)
        {
            System.out.println("Child-Thread...");
        }
    }
}

public class RunnableDemo1
{
    public static void main(String[] args) {

        MyRunnable r1 = new MyRunnable();
        Thread t1 = new Thread(r1);
        t1.start();

        for(int i=0; i<10; i++)
        {
            System.out.println("MainCredit-Thread");
        }

    }
}
