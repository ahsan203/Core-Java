package Practice.String_StringBuffer_StringBuilder.String;

public class Example2
{
    public static void main(String[] args) {

        String s1 = new String("Ahsan");
        String s2 = new String("Ahsan");
        String s3=s2;

        System.out.print("s1==s2 : ");
        System.out.println("s1==s2 : " + s1==s2);

        System.out.print("s2==s3 : ");
        System.out.println(s2==s3);

        System.out.println("s1.equals(s2) : " + s1.equals(s2));

        System.out.println("----------------------------------------------------");

        StringBuffer sb1 = new StringBuffer("Coffee");
        StringBuffer sb2 = new StringBuffer("Coffee");

        System.out.print("sb1==sb2 : ");
        System.out.println(sb1==sb2);
        System.out.println("sb1.equals(sb2) : " + sb1.equals(sb2));



    }
}
