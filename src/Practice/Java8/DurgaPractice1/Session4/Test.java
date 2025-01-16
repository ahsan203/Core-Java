package Practice.Java8.DurgaPractice1.Session4;

public class Test
{
    public static void main(String[] args) {

        //--- With Anonymous Interface ....

        Runnable anonymous1 = new Runnable()
        {
            public void run()
            {
                for(int i=0; i<10; i++)
                {
                    System.out.println("Child-Thread");
                }
            }
        };

        Thread t1 = new Thread(anonymous1);
        t1.start();

        for(int i=0; i<10; i++)
        {
            System.out.println("MainCredit-Thread");
        }

    }
}