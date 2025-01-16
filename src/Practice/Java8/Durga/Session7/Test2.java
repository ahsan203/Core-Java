package Practice.Java8.Durga.Session7;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test2
{
    public static void main(String[] args) {

        Function<String,String> f1 = s1 -> s1.trim();
        String s1 = "         Ahsan            ";
        System.out.println(s1);
        System.out.println(f1.apply(s1));

        System.out.println("------------------------------------------------------");

        Function<String,String> f2 = s2 -> s2.replace(" ","");
        String s2 = "Ahsan Shareef Mohammed";
        System.out.println(s2);
        System.out.println(f2.apply(s2));
    }
}
