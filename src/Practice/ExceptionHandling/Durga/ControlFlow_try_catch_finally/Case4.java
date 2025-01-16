package Practice.ExceptionHandling.Durga.ControlFlow_try_catch_finally;

public class Case4
{
    public static void main(String[] args) {

        System.out.println("case-2 : If an exception raised at Statement-4.");
        System.out.println("-------------------------------------------------------------------------------------");


        try{
            System.out.println("Statement-1");
            System.out.println("Statement-2"+10/0);
            System.out.println("Statement-3");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Statement-4"+10/0);
        }
        finally {
            System.out.println("Statement-5");
        }
        System.out.println("Statement-6");
    }
}
