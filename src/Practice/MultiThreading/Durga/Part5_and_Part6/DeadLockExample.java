package Practice.MultiThreading.Durga.Part5_and_Part6;

//--- Case-1 :

public class DeadLockExample extends Thread
{
    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName() + "-thread started.......");

        Thread.currentThread().join();

        for(int i=0; i<3; i++)
        {
            System.out.println("Ahsan");
        }
    }
}


//--- Case2 :
class Child extends Thread
{
    static Thread pt;

    public void run() {
        try {
            pt.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        for (int i = 0; i < 10; i++)
        {
            System.out.println("Child-Thread.....");
        }
    }
}

class Parent
{
    public static void main(String[] args) {

        Child.pt = Thread.currentThread();

        Child c = new Child();
        c.start();

        try {
            c.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        for (int i = 0; i < 10; i++)
        {
            System.out.println("MainCredit-Thread.....");
        }
    }
}
