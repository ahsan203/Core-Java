package Practice2.String_StringBuuilder;

public class Test1
{
    public static void main(String[] args) {


        String s = new String("Ahsan");
        s.concat(" Shareef");
        System.out.println("s = "+s);

        StringBuffer sb1 = new StringBuffer("Durga");
        sb1.append(" Software");
        System.out.println("sb1 = "+sb1);
    }
}
