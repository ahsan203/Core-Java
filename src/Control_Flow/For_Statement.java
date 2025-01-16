package Control_Flow;

public class For_Statement
{
    public static void main(String[] args)
    {
        for(int counter=1; counter<=    5; counter++)
        {
            System.out.println(counter);
        }

        for(double i=2; i<=5; i++)
        {
             System.out.println("10000 at "+i+"% interest = : " + calculateInterest(10000.0, i));
        }

        for(double rate=7.5; rate<=10.0; rate+=0.25)
        {
                System.out.println("100 at "+rate+"% interest = : " + calculateInterest(100.0,rate));

                if(rate==8.5)
                {
                    break;
                }
        }
    }

    public static double calculateInterest(double amount, double interestRate)
    {
        return (amount * (interestRate/100));
    }
}
