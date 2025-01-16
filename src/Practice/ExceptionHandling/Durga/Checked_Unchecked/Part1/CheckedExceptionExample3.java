package Practice.ExceptionHandling.Durga.Checked_Unchecked.Part1;

public class CheckedExceptionExample3
{
    public static void main(String[] args)
    {

        System.out.println("------------ Intead of \"throws-keyword\", I am using try/catch block -------------");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Program ended successfully!!!");
    }
}
