package Practice.MultiThreading.Durga.Part7.example_2;

public class SavingsAccount
{
    private double amount = 1000;
    private double debitAmt;
    private double creditAmt;


    public synchronized void debitAmt(double debitAmt)
    {
        amount = amount - debitAmt;

        System.out.println("Remaining Balance : " + amount);
    }


    public void creditAmt(double creditAmt)
    {
        amount = amount + creditAmt;

        System.out.println("Remaining Balance : " + amount);
    }

    public double getDebitAmt() {
        return debitAmt;
    }

    public void setDebitAmt(double debitAmt) {
        this.debitAmt = debitAmt;
    }

    public double getCreditAmt() {
        return creditAmt;
    }

    public synchronized void setCreditAmt(double creditAmt) {
        this.creditAmt = creditAmt;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "amount=" + amount +
                ", debitAmt=" + debitAmt +
                ", creditAmt=" + creditAmt +
                '}';
    }
}
