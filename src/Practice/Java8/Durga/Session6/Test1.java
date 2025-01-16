package Practice.Java8.Durga.Session6;

import Practice.RuntimePolymorphism.Personal.A;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class Test1
{
    public static void main(String[] args) {

        Predicate<Integer> p1 = I->I>10;

        System.out.println(p1.test(1));
        System.out.println(p1.test(5));
        System.out.println(p1.test(13));

        System.out.println("-----------------------------------------------------------");

        Predicate<Integer> p2 = i1 -> i1%2==0;

        System.out.println(p2.test(6));
        System.out.println(p2.test(5));
        System.out.println(p2.test(8));

        System.out.println("------------------------------------------------------");

//------------ Program to check whether length of String is greater than 5 -------------

        Predicate<String> s1 = str1 -> str1.length() >= 5;

        System.out.println("Zaid : " + s1.test("Zaid"));
        System.out.println("Farnaaz : " + s1.test("Farnaaz"));
        System.out.println("Aisha : " + s1.test("Aisha"));

        System.out.println("--------------------------------------------------");


//------------ Program to check whether given ArrayList is empty OR not-empty ----------------

        ArrayList al1 = new ArrayList();
        al1.add("zaid");
        al1.add("Farnaaz");
        al1.add("Aisha");
        System.out.println(al1);

        ArrayList al2 = new ArrayList();
        System.out.println(al2);

        Predicate<Collection> c1 = a1 -> a1.isEmpty();

        System.out.println(c1.test(al1));

        System.out.println(c1.test(al2));

    }
}
