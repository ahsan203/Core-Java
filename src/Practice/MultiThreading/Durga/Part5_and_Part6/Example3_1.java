package Practice.MultiThreading.Durga.Part5_and_Part6;


class ChildThread extends Thread {

    Example3_1 mt;

    ChildThread(Example3_1 mt)
    {
        this.mt = mt;
    }

    public void run() {
        try {
            mt.join();
        } catch (InterruptedException e) {

        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Child-Thread.....");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
    }
}

public class Example3_1  extends Thread
{
    public static void main(String[] args) {

        Example3_1 mt = new Example3_1();
        mt.start();

        ChildThread ct = new ChildThread(mt);
        ct.start();


    }
    public void run()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("MainCredit-Thread.....");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
    }
}
