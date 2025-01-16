package Practice.java_lang.Part9_Wrapper;

public class parseXXX
{
    public int sum (String a, String b) {

        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);

        int c = a1 + b1;

        return c;
    }

    public static void main(String[] args) {

        parseXXX p1 = new parseXXX();
        int result = p1.sum("123","2");
        System.out.println("Sum : " + result);
    }
}
