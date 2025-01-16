package Practice.java_lang.Part8_WrapperClass;

public class Test1
{
    Boolean b1 = new Boolean("false");

    Double d1 = new Double("12.3");

    Integer i1 = new Integer(12);

    Character c1 = Character.valueOf('c');


    public static void main(String[] args) {

        Integer i3 = 10;
        Integer i4 = 10;

        Integer i5 = Integer.valueOf("102");
        Integer i6 = Integer.valueOf("10");

        System.out.println(i3);
        System.out.println(i5);
        System.out.println(i3.equals(i4));

        System.out.println(i5.equals(i6));


        Boolean b1 = new Boolean("TRue");
        System.out.println(b1);

        Boolean b2 = new Boolean("Ahsan");
        System.out.println(b2);

        Boolean b3 = Boolean.valueOf("TRUe");
        System.out.println(b3);
    }
}
