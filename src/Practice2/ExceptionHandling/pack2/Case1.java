package Practice2.ExceptionHandling.pack2;

public class Case1
{
    public static void main(String[] args) {

        System.out.println("State-1");
        try {
            System.out.println(10 / 0);
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
        }
        System.out.println("State-2");
    }
}
