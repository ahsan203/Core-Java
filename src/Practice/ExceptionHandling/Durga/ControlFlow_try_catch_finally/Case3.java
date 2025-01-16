package Practice.ExceptionHandling.Durga.ControlFlow_try_catch_finally;

public class Case3
{
    public static void main(String[] args) {

        System.out.println("case-3 : If an exception raised at Statement-2 and corresponding catch-block Not-Matched.");
        System.out.println("-------------------------------------------------------------------------------------");


        try{
            System.out.println("Statement-1");
            System.out.println("Statement-2"+10/0);
            System.out.println("Statement-3");
        }
        catch (NullPointerException e)
        {
            System.out.println("Statement-4");
        }
        finally {
            System.out.println("Statement-5");
        }
        System.out.println("Statement-6");
    }
}
