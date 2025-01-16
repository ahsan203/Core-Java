package Practice.java_lang.Part10_Autoboxing_Autounboxing;

public class Test2
{
    public static void main(String[] args) {

//---Case -1 :
                 Integer X = new Integer(10);
                 Integer Y = new Integer(10);
                 System.out.println("Case -1 : " + (X==Y));

//---Case -2 :
                Integer X3 = Integer.valueOf(10);
                Integer Y3 = Integer.valueOf(10);
                System.out.println("Case -2 : " + (X3==Y3));

//---Case -3 :
                Integer X2 = new Integer(10);
                Integer Y2 = 10;
                System.out.println("Case -3 : " + (X2==Y2));

//---Case -4 :
                Integer X4 = 10;
                Integer Y4 = 10;
                System.out.println("Case -4 : " + (X4==Y4));

//---Case -5 :
                Integer X5 = 127;
                Integer Y5 = 127;
                System.out.println("Case -5 : " + (X5==Y5));

//---Case -5.1 :
                Integer X5_1 = 128;
                Integer Y5_1 = 128;
                System.out.println("Case -5.1 : " + (X5_1==Y5_1));

//---Case -6 :
                Integer X6 = 1000;
                Integer Y6 = 1000;
                System.out.println("Case -6 : " + (X6==Y6));


 //--- Case -7 :
                Integer X7 = Integer.valueOf(122);
                Integer Y7 = Integer.valueOf(122);
                System.out.println("Case -7 : " + (X7==Y7));






    }
}
