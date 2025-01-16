package Practice.OOPS.Durga.Section7_Object_Type_Casting.Three_Mantras_Type_Casting;

public class Example1
{
    public static void main(String[] args) {

    //--- Case-1 :
        
            Object o = new String("Ahsan");
            StringBuffer sb = (StringBuffer) o;


    //--- Case-2 :
                    Object o1 = new String("Zaid");
                    String s1 = (String) o1;
                    System.out.println(s1);
                    System.out.println(o1);


    }
}
