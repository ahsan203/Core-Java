package Practice.MultiThreading.Durga.Part3;

public class Example2 extends Thread
{
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("MainCredit-Thread..........");
        System.out.println(Thread.currentThread().getName());

        Example2 ex2 = new Example2();
        System.out.println(ex2.getName());
        ex2.setName("Ahsan's thread");
        System.out.println(ex2.getName());

    }
}
