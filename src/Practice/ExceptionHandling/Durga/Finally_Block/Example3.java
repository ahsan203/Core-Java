package Practice.ExceptionHandling.Durga.Finally_Block;

public class Example3
{
    public static void main(String[] args) {
        try
        {
            System.out.println("try");
            System.out.println(10/0);
        }

        finally
        {
            System.out.println("finally-block");
        }
    }
}
