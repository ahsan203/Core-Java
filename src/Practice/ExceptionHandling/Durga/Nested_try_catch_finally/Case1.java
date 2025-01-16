package Practice.ExceptionHandling.Durga.Nested_try_catch_finally;

public class Case1
{
    public static void main(String[] args) {

        System.out.println("Inside try-block : Nested try-catch-finally.");
        System.out.println("--------------------------------------------");

        try
        {
            System.out.println("Statement-1");
            try
            {
                System.out.println("Statement-2"+10/0);
            }
            catch (ArithmeticException e)
            {
                System.out.println("Statement-2"+"----Resolved--------");
            }
            System.out.println("Statement-3");
            System.out.println("Statement-4");
            System.out.println("Statement-5");
        }
        catch (Exception e)
        {
            System.out.println("Statament-6");
        }
        finally {
            System.out.println("Statement-7");
        }
        System.out.println("Statement-8");
    }
}
