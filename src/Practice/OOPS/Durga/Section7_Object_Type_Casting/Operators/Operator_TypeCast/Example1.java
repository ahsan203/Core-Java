package Practice.OOPS.Durga.Section7_Object_Type_Casting.Operators.Operator_TypeCast;

public class Example1
{
    public static void main(String[] args) {

        // ---------- Implicit-TypeCasting :--------------------------------

        /*
            byte--->short--->int--->long--->float--->double
                    char---->int
         */

        int i = 120;
        float f = i;
        System.out.println(f);
        //System.out.println(((Object) f).getClass().getName());


        // --------------- Explicit-TypeCasting : ----------------------------------

        /*
                byte<----short<---int<----long<----float<----double
                         char<----int
         */

        int x =130;
        byte b = (byte) x;
        System.out.println(b);

        long l =120;
        int i2 = (int) l;
        System.out.println(i2);
    }
}

