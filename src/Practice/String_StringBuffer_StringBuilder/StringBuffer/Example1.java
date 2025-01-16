package Practice.String_StringBuffer_StringBuilder.StringBuffer;

public class Example1
{
    public static void main(String[] args) {

        StringBuffer sb1 =  new StringBuffer();

        System.out.println(sb1.capacity());

        StringBuffer sb2 = new StringBuffer("abcdefg");

        System.out.println("capacity = " + (sb2.length() + 16) );
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
    }
}
