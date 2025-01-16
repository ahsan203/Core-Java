package Practice.MultiThreading.Durga.Part7.example_1;

public class MyThread extends Thread
{
    Display d;
    String name;

    public MyThread(Display d, String name)
    {
        this.d = d;
        this.name = name;
    }

    public void run()
    {
        d.wish(name);
    }

    public static void main(String[] args) {

        Display d = new Display();
        MyThread t1 = new MyThread(d,"Ronaldo");
        MyThread t2 = new MyThread(d, "Messi");
        MyThread t3 = new MyThread(d, "Neymar");

        t1.start();
        t2.start();
        t3.start();
    }
}
