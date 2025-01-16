package Practice.MultiThreading.Durga.Part2;

public class Example2 extends Thread
{
    public static void main(String[] args) {

        System.out.println("MainCredit-Thread started....");

        Example2 ex2 = new Example2();
        ex2.start();
        //ex2.run(2,3);

    }

    public void run()
    {
        System.out.println("Child-Thread.....");
    }

    public void run(int a, int b)
    {
        int c = a+b;
        System.out.println("addition of "+a+" and "+b+" = "+c);
    }
}
