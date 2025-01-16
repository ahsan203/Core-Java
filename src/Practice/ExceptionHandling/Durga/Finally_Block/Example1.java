package Practice.ExceptionHandling.Durga.Finally_Block;

public class Example1
{
    public static void main(String[] args) {

        try
        {
            System.out.println(10/0);
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
