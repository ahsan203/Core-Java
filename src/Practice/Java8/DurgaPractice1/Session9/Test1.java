package Practice.Java8.DurgaPractice1.Session9;

import Practice.Java8.Durga.Session9.SystemDate;

import java.util.Date;
import java.util.function.Supplier;

public class Test1
{
    public static void main(String[] args) {

        //------- To get SystemDate....

        Supplier<Date> s1 = ()-> new Date();

        System.out.println(s1.get());

        //------ To generate Random name :

        Supplier<String> s2 = ()->
        {
            String[] names = {"ahsan","shoeab","zaki"};

            int x = (int) Math.random() *4 ;

            return names[x];
        };

        System.out.println(s2.get());
    }
}
