package Practice.InnerClasses.Durga.Part3;

public class ThreadDemo2
{
    public static void main(String[] args) {

        Thread t1 = new Thread()
        {
            public void run()
            {
                for(int i=0; i<10; i++)
                {
                    System.out.println("Anonymous-Class-Child-Thread");
                }
            }
        };
        t1.start();

        for(int i=0; i<10; i++)
        {
            System.out.println("MainCredit-Thread...");
        }
    }
}
