package Practice.LanguageFundamentals.Part12;

public class VarArg2
{
    public static int sum(int... num)
    {
       int  total = 0;

       for(int x : num)
       {
           total = total + x;
       }

       return total;
    }

    public static void main(String[] args) {

        System.out.println(sum());

        System.out.println(sum(10,20));
    }
}
