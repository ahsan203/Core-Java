package Practice2.String_StringBuuilder;

public class Test4
{
    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer();
        System.out.println("sb1-capacity = " + sb1.capacity());

        StringBuffer sb2 = new StringBuffer(200);
        System.out.println("sb2-capacity = " + sb2.capacity());

        String s = "Ahsan";
        StringBuffer sb3 =new StringBuffer(s);
        System.out.println("sb3-capacity = " + sb3.capacity());

        StringBuffer sb4 = new StringBuffer("Ahsan");
        sb4.append(" Shareef ");
        sb4.append( true);
        sb4.append(", PI value is = ");
        sb4.append(3.14);
        System.out.println("sb4 = " + sb4);

        StringBuffer sb5 = new StringBuffer("Java");
        System.out.println(sb5.reverse());
        System.out.println(sb5.charAt(0));
        System.out.println(sb5.substring(1,4));


        StringBuffer sb6 = new StringBuffer("Ahsan");
        System.out.println("sb6-capacity = " + sb6.capacity());
        sb6.ensureCapacity(29);
        System.out.println("sb6-capacity = " + sb6.capacity());

        sb6.trimToSize();
        System.out.println("sb6-capacity = " + sb6.capacity());
    }
}
