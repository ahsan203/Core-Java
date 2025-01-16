package Practice.java_lang.Part8_WrapperClass;

public class Test2
{
    public static void main(String[] args) {

        Integer i1 = Integer.valueOf("10");
        System.out.println(i1);

        int a = i1.intValue();
        System.out.println(a);


        Character c = Character.valueOf('a');
        System.out.println(c);

        char c1 = c.charValue();
        System.out.println(c1);

    }
}
