package Practice.ExceptionHandling.Durga.Finally_Block;

public class Example2
{
    public static void main(String[] args) {

        try
        {
            System.out.println("try");
        }
        catch (ArithmeticException ae)
        {
            ae.printStackTrace();
        }
        finally
        {
            System.out.println("finally-block");
        }
    }
}
