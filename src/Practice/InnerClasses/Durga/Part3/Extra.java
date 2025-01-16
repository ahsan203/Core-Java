package Practice.InnerClasses.Durga.Part3;

public class Extra
{
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++)
                {
                    System.out.println("Cub-Thread");
                }
            }
        });
        t1.start();
        for( int i=0; i<10; i++)
        {
            System.out.println("Tiger-Thread");
        }
    }
}
