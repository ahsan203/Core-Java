package Practice.LanguageFundamentals.Part12;

public class VarArg1
{
    public static void m1(int... x)
    {
        System.out.println("var-arg method... length : " + x.length);

        if(x.length>0) {
            System.out.println(x[1]);
        }
    }
    public static void main(String[] args) {

        m1();
        m1(10,20);
        m1(10,50,(int)23l);


    }
}
