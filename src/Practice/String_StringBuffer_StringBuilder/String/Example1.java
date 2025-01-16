package Practice.String_StringBuffer_StringBuilder.String;

public class Example1
{
    public static void main(String[] args) {

        String s1 = new String("Ahsan");
        s1.concat(" Shareef Mohammed");
        System.out.println(s1);
        //System.out.println(s2);


        StringBuffer sb1 = new StringBuffer("Ahsan");
        sb1.append(" Shareef Mohammed");
        System.out.println(sb1);
    }
}
