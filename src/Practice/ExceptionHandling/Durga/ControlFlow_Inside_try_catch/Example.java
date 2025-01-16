package Practice.ExceptionHandling.Durga.ControlFlow_Inside_try_catch;

public class Example
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
        }
        System.out.println("Statement-3");
    }
}
