package Practice.MultiThreading.Durga.Part7.example_1;

public class Display
{
    public synchronized void wish(String name)
    {
        for(int i=0; i<=10; i++)
        {
            System.out.print("Good Morning : ");
            try{
                Thread.sleep(200);
            }
            catch (InterruptedException ie){}
            System.out.println(name + "-" +i);
        }
    }
}
