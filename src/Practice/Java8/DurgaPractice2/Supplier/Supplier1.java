package Practice.Java8.DurgaPractice2.Supplier;

import java.util.function.Supplier;

public class Supplier1
{
    public static void main(String[] args) {

        Supplier<String> s1 = ()->
        {
            String otp = "";

            for(int i=0;i<6;i++)
            {
                int random = (int) (Math.random()*10);

                otp = otp+random;
            }

            return otp;
        };

        System.out.println(s1.get());
        System.out.println(s1.get());
        System.out.println(s1.get());
        System.out.println(s1.get());
        System.out.println(s1.get());
    }
}
