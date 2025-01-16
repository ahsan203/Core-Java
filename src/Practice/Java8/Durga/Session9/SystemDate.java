package Practice.Java8.Durga.Session9;

import java.util.Date;
import java.util.function.Supplier;

public class SystemDate
{
    public static void main(String[] args) {

        Supplier<Date> supplier1 = () -> {return new Date();};

        System.out.println(supplier1.get());
    }
}
