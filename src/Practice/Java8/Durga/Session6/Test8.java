package Practice.Java8.Durga.Session6;

import java.util.function.Predicate;

public class Test8
{
    public static void main(String[] args) {

        Predicate<String> p1 = Predicate.isEqual("Ahsan");
        System.out.println(p1.test("Ahsan"));
        System.out.println(p1.test("Zaid"));
        System.out.println(p1.test("ahsan"));
    }
}
