package Practice.Java8.Durga.Session9;

import java.util.Random;
import java.util.function.Supplier;

public class Random_OTP
{
    public static void main(String[] args) {

        Supplier<String> supplier1 = () ->
        {
            String otp = " ";

            for(int i=0; i<6; i++)
            {
                otp = otp + (int) (Math.random()*10);
            }

            return otp;

        };

        System.out.println(supplier1.get());
        System.out.println(supplier1.get());
        System.out.println(supplier1.get());System.out.println(supplier1.get());
        System.out.println(supplier1.get());

        System.out.println("-----------------------------------------------------------------");

        Supplier<String> supplier2 = ()->
        {
            Random random = new Random();
            int randomNumber = random.nextInt(10);

            String num = "";

            for(int i=0;i<6; i++)
            {
                num = num + randomNumber + (int) (Math.random()*10);
            }

            return num;
        };
        System.out.println(supplier2.get());
        System.out.println(supplier2.get());
        System.out.println(supplier2.get());System.out.println(supplier2.get());
        System.out.println(supplier2.get());


    }
}