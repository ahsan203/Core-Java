package Practice.MultiThreading.Durga.Part7.example_2;

public class User extends Thread
{
    SavingsAccount sa;
    double amount;



    public User(SavingsAccount sa,double amount)
    {
        this.sa = sa;
        this.amount = amount;
    }

    @Override
    public void run() {

        for(int i=1; i<=5 ; i++)
        {
            try
            {
                System.out.println("hehehe...");
                Thread.sleep(100);
            }
            catch (InterruptedException ie)
            {
                System.out.println("Thread is sleeping....");
            }
        }


        sa.creditAmt(amount);
    }

}
