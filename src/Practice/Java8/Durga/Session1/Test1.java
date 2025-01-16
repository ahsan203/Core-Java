package Practice.Java8.Durga.Session1;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test1
{
    public static void main(String[] args) {

        Function<Integer,Integer> f1 = i->i*i;
        System.out.println(f1.apply(3));

        Predicate<Integer> p1 = i->i%2==0;
        System.out.println(p1.test(4));
    }
}
