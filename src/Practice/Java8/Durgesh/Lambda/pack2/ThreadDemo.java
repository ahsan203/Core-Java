package Practice.Java8.Durgesh.Lambda.pack2;

public class ThreadDemo
{
    public static void main(String[] args) {

        //---- First thread : Thread - ZAID

        Runnable thread_zaid = ()->
        {
            for(int i=1; i<=10; i++)
            {
                System.out.println("Value of i is " + i);

                try
                {
                    Thread.sleep(100);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(thread_zaid);
        t1.setName("ZAID");
        t1.start();
        System.out.println(t1.getName());


    //--- Creating Thread-2 : Multiplication table for 2

        Runnable mul_2 = ()->
        {
            for(int i=1; i<=10; i++)
            {
                try {
                    System.out.println("2 * " + i + " = " + i * 2);
                    Thread.sleep(800);
                }
                catch (InterruptedException ie)
                {
                    ie.printStackTrace();
                }
            }
        };

        Thread t2 = new Thread(mul_2);
        t2.start();
    }
}
