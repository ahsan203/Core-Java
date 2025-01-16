package Practice.MultiThreading.Durga.Part2;



public class Example4 extends Thread
{
    public static void main(String[] args) {

        Example4 ex4 = new Example4();
        ex4.start();
        System.out.println("MainCredit-Thread...");
    }

    public void start()
    {
        super.start();
        System.out.println("Start() method....");
    }

    public void run()
    {
        //super.start();
        System.out.println("Child-Thread....");
    }
}
