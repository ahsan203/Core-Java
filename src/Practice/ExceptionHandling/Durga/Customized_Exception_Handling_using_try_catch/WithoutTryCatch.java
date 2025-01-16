package Practice.ExceptionHandling.Durga.Customized_Exception_Handling_using_try_catch;

public class WithoutTryCatch
{
    public static void main(String[] args) {

        System.out.println("Statement-1");
        try {
            System.out.println(10 / 0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Sorry Arithmetic-Exception occurred.");
        }
        System.out.println("Statement-3");
    }
}
