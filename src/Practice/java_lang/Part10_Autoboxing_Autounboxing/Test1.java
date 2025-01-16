package Practice.java_lang.Part10_Autoboxing_Autounboxing;

public class Test1
{
    static Integer I = 10; // Auto-boxing

    public static void m1(Integer K) // Auto-boxing
    {
        int m = K; // Auto-unboxing
        System.out.println(m);
    }

    public static void main(String[] args) {

        int i = I; // Auto-unboxing
        m1(i); //Auto-boxing
    }
}

