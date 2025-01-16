package Practice.MultiThreading.Durga.Part5_and_Part6;

public class SlideRotator extends Thread
{
    public static void main(String[] args) throws InterruptedException{

        for(int i=1; i<=10; i++)
        {
            System.out.println("Slide-"+i);
            Thread.sleep(2000);
        }
    }
}
