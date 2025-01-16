package Practice.ExceptionHandling.Durga.Runtime_Stack_Mechanism;

public class Test
{
    public static void main(String[] args)
    {
        doStuff();
    }

    public static void doStuff()
    {
        doMoreStuff();
    }

    public static void doMoreStuff()
    {
        System.out.println("Hello");
    }
}

// ----------- Story of above Program ------------
/*
    In the above Program we have only one Thread i.e. "MainCredit-Thread", as every java-program by default has "MainCredit-Thread"
    As we know for every thread JVM will create one Runtime-Stack internally.
    And for method() call by thread, its entry will be stored in Runtime-Stack.
    Each entry in Stack is "Stack-Frame" OR "Activation-Record"

 */