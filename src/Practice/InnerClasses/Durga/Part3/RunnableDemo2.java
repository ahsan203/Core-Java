package Practice.InnerClasses.Durga.Part3;

public class RunnableDemo2
{
    public static void main(String[] args) {

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++)
                {
                    System.out.println("Anonymous-Inner-Class-Runnable-Child-Thread.");
                }
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();

        for(int i=0; i<10; i++)
        {
            System.out.println("MainCredit-Thread...");
        }
    }
}
