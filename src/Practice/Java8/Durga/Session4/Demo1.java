package Practice.Java8.Durga.Session4;

public class Demo1
{
    public static void main(String[] args) throws InterruptedException{

        for(int i=0; i<10; i++)
        {
            System.out.println(i + "-> MainCredit-Thread");
            Thread.sleep(500);
        }

        Runnable z1 = new Runnable()
        {
          public void run()
          {
              for(int i=0; i<10; i++)
              {
                  System.out.println(i+"-> First Child");
                  try {
                      Thread.sleep(500);
                  }
                  catch (InterruptedException ie)
                  {
                      ie.printStackTrace();
                  }
              }
          }
        };
        Thread t1 = new Thread(z1);
        t1.start();

        Runnable z2 = ()->
        {
            for(int i=0; i<10; i++)
            {
                System.out.println(i+"-> Second Child");
                try
                {
                    Thread.sleep(500);
                }
                catch (InterruptedException ie)
                {
                    ie.printStackTrace();
                }
            }
        };
        Thread t2 = new Thread(z2);
        t2.start();



        Thread t3 = new Thread( () -> {
            for(int i=0; i<10; i++)
            {
                System.out.println(i+"-> Third Child");
                try
                {
                    Thread.sleep(500);
                }
                catch (InterruptedException ie)
                {
                    ie.printStackTrace();
                }
            }
        });
        t3.start();
    }
}
