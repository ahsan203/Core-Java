package Practice.Java8.DurgaPractice1.Session4;

public class Test2
{
    public static void main(String[] args) {

        //---- With Lambda Expression

        Runnable lambda = ()->
        {
            for(int i=0; i<10; i++)
            {
                System.out.println("Child-Thread");
            }
        };
        Thread t2 = new Thread(lambda);
        t2.start();

        for(int i=0; i<10; i++)
        {
            System.out.println("MainCredit-Thread");
        }
    }
}
