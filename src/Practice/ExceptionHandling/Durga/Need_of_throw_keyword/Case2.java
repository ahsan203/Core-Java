package Practice.ExceptionHandling.Durga.Need_of_throw_keyword;

public class Case2
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Program started.");
        System.out.println(withdraw(400000) );
        System.out.println("Program-Ended successfully.");
    }

    public static double withdraw(double amount) throws Exception
    {   double balance = 300000.0;
        if(amount>balance)
        {
            throw new Exception("Insufficient-funds, Please enter other amount.");
        }
        else
        {
            return amount-5;
        }
    }
}
