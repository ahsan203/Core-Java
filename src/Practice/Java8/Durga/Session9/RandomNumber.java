package Practice.Java8.Durga.Session9;

import java.util.Random;
import java.util.function.Supplier;

public class RandomNumber
{
    public static void main(String[] args) {

        Supplier<String> supplier = () -> {

            String[] names = {"Sunny","Bunny","Chinny","Vinny"};

            int x = (int) (Math.random() * 4);

            return names[x];
        } ;

        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());

    }
}
