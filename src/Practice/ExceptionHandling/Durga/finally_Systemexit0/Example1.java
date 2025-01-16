package Practice.ExceptionHandling.Durga.finally_Systemexit0;

public class Example1
{
    public static void main(String[] args) {

        try
        {
            System.out.println("try");
            System.out.println(10/0);
            System.out.println("try2");

        }
        catch (ArithmeticException ae)
        {
            ae.printStackTrace();

        }
        finally {
            System.out.println("Finally-Block executed");
        }

    }
}
