package Practice.String_StringBuffer_StringBuilder.String;

import java.util.Locale;

public class Methods
{
    public static void main(String[] args) {

        String s1 = "Ahsan Shareef Mohammed";

        System.out.println(s1.charAt(4));

        s1 = s1.concat(" (zaid).");

        System.out.println(s1);

        String s2 = "AHSAN SHAREEF MOHAMMED (ZAID).";

        System.out.println(s1.equals(s2));

        String s3 = "AHSAN SHAREEF MOHAMMED (ZAID).";

        System.out.println(s1.equalsIgnoreCase(s3));


        System.out.println(s3.isEmpty());
        System.out.println(s3.isBlank());

        System.out.println(s3.length());

        System.out.println(s3.replace('A','a'));

        System.out.println(s3.substring(23));

        System.out.println(s3.substring(24,28));


        String s4 = "Coffee";

        System.out.println(s4.indexOf('e'));

        System.out.println(s4.lastIndexOf('e'));


        System.out.println(s4.toUpperCase());
        System.out.println(s4.toLowerCase());




    }
}
