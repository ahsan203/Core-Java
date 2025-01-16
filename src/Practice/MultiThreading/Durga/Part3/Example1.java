package Practice.MultiThreading.Durga.Part3;

import Practice.ExceptionHandling.Durga.Important_cases_throws_keyword.Exa;

public class Example1 implements Runnable
{
    @Override
    public void run() {
         for(int i=0; i<=10; i++)
         {
             System.out.println("Child-Thread....");
         }
    }

    public static void main(String[] args) {

        Example1 ex1 = new Example1();
        Thread t1= new Thread(ex1);
        t1.start();

        for(int i=0; i<=10; i++)
        {
            System.out.println("MainCredit-Thread");
        }
    }
}
