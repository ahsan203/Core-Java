package Practice.ExceptionHandling.Durga.DefaultExceptionHandling.Part1;

public class Test
{
    public static void main(String[] args) {

        doStuff();
    }

    public static void doStuff()
    {
        doMoreStuff();
    }

    public static void doMoreStuff()
    {
        System.out.println("Hello");
        System.out.println(10/0);
    }
}

/*
1) For every thread JVM will create runtime stack....
2) Each and every method() call made by thread, one entry will be stored in internal Stack created by JVM.
3) That one entry of method() call in stack is called as Stack-Frame OR Activation-record.
4) If any exception occurs inside any method() then that particular method will create and "Exception-Object"
        Exception-Object contains following info:
                                                   a) Thread-name in which Exception occurred.
                                                   b) Name of Exception
                                                   c) Description of Exception.
                                                   d) StackTrace/Location of Exception....

5) Once any particular method() got completed, then it's entry from Stack also gets deleted.
6) After completing all the methods() then Stack and thread will be destroyed by JVM.
 */