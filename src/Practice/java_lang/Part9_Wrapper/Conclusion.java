package Practice.java_lang.Part9_Wrapper;

public class Conclusion
{

    public int sum (String a, String b) {

        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);

        int c = a1 + b1;

        return c;
    }

    public void areaOfRectangle(int countryCode, int phoneNumber)
    {
        String s1 = Integer.toString(countryCode);
        String s2 = Integer.toString(phoneNumber);

        String fullPhone = "+" + s1+s2;

        System.out.println("By using \"toString()\" Phone : " + fullPhone);
    }


    public static void main(String[] args)
    {

    //--------- Example of Integer.valueOf() : --------------------------------------
        int valueOf1 = 10;
        String valueOf2 = "990";

        Integer I1 = Integer.valueOf(valueOf1);
        Integer I2 = Integer.valueOf(valueOf2);

        Integer sum1 = I1 + I2;
        System.out.println("By using \"valueOf()\" Sum : " + sum1);

        System.out.println("----------------------------------------------------------");





    //--------- Example of intValue() ---------------------------------------------------
        Integer a1 = Integer.valueOf(120);
        int a2 = 30;

        int a3 = a1.intValue();

        int sum2 = a3 + a2;

        System.out.println("By using \"intValue()\" Sum :  " + sum2);

        System.out.println("----------------------------------------------------------");

        Conclusion con1 = new Conclusion();




    //----------- Example of Integer.parseInt() ------------------------------------
        int result = con1.sum("123","2");
        System.out.println("By using \"Integer.parseInt()\" Sum : " + result);

        System.out.println("----------------------------------------------------------");






    //--------------- Example of toString() --------------------------------------------
        con1.areaOfRectangle(1,2019823527);

        System.out.println("----------------------------------------------------------");
    }
}
