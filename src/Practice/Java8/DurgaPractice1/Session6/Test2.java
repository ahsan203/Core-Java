package Practice.Java8.DurgaPractice1.Session6;

import java.util.function.Predicate;

public class Test2
{
    public static void main(String[] args) {

        Predicate<String> p = s->s.length()>5;

        System.out.println(p.test("Zaid"));
    }
}
