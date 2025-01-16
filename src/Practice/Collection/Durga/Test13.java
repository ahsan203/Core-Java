package Practice.Collection.Durga;

public class Test13
{
    public static void main(String[] args) {

        System.out.println("Using compareTo() of Comparable-Interface which is present in java.lang package.");

        System.out.println( "\"A\".compareTo(\"Z\") = "+ "A".compareTo("Z"));

        System.out.println("\"Z\".compareTo(\"K\") = " +"Z".compareTo("K"));

        System.out.println("\"A\".compareTo(\"A\") = " +"A".compareTo("A"));

        System.out.println("-------------------------------------------------");

        System.out.println("using compareTo with Wrapper-objects : ");
        System.out.println( "Integer.valueOf(14).compareTo(Integer.valueOf(12)) = " + Integer.valueOf(14).compareTo(Integer.valueOf(12)));
        System.out.println( "Integer.valueOf(1).compareTo(Integer.valueOf(12)) = " + Integer.valueOf(1).compareTo(Integer.valueOf(12)));
        System.out.println( "Integer.valueOf(12).compareTo(Integer.valueOf(12)) = " + Integer.valueOf(12).compareTo(Integer.valueOf(12)));
    }
}
