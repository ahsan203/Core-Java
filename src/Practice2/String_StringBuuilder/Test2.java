package Practice2.String_StringBuuilder;

public class Test2
{
    public static void main(String[] args) {

        String s1 = new String("You cannot change Me");
        String s2 = new String ("You cannot change Me");
        System.out.println(s1==s2);

        String s3 = "You cannot change Me";
        System.out.println(s1==s3);

        String s4 = "You cannot change Me";
        System.out.println(s3==s4);

        String s5 = "You cannot " + "change Me";
        System.out.println(s4==s5);

        String s6 = "You cannot ";
        String s7 = s6 + "change Me";
        System.out.println(s4==s7);

        final String s8 = "You Cannot ";
        String s9 = s8 +"change Me";
        System.out.println(s4==s9);


    }
}
