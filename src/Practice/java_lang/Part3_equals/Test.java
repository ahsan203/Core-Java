package Practice.java_lang.Part3_equals;

public class Test
{
    public static void main(String[] args) {

        String[] names = {"ahsan","shoeab","zaki"};

        System.out.println("names.length = " + names.length);

        System.out.println("names[0].length() = " + names[0].length() );

        //----
        int i1 = 28;
        Integer I1 = Integer.valueOf(i1);
        int i2 = I1.intValue();
        System.out.println(I1+"----"+i2);
    }
}
