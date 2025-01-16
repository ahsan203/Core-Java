package Practice.ExceptionHandling.Durga.ControlFlow_Inside_try_catch;

public class Example2
{
    public static void main(String[] args) {
        try{
            System.out.println("Statement-1");
            System.out.println(10/0);
            System.out.println("Statement-2");
        }
        catch (ArithmeticException ae)
        {
            System.out.println("Arithmetic-Exception occurred!!!!");
            try {
                System.out.println(10 / 0);
            }
            catch (ArithmeticException ae1)
            {
                System.out.println("Second Arithmetic Exception has occurred!!!");
            }
        }
        System.out.println("Statement-3");
    }
}
