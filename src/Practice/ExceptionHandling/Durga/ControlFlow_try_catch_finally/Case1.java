package Practice.ExceptionHandling.Durga.ControlFlow_try_catch_finally;

public class Case1
{
    public static void main(String[] args) {

        System.out.println("Exception-Handling : Control Flow in try/catch & finally block!");

        try{
            System.out.println("Statement-1");
            System.out.println("Statement-2");
            System.out.println("Statement-3");
        }
        catch (Exception e)
        {
            System.out.println("Statement-4");
        }
        finally {
            System.out.println("Statement-5");
        }
        System.out.println("Statement-6");
    }
}
