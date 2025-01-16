package Practice.OOPS.Durga.Section4_DataHiding_Abstraction_EncapSulation.Encapsulation;

public class Account
{
    private double balance;

    public double getBalance()
    {
        //---validation -----

        return balance;
    }

    public void setBalance(double amount)
    {
        //---validation----
        this.balance=this.balance+amount;
    }
}
