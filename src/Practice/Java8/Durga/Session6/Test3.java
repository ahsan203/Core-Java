package Practice.Java8.Durga.Session6;

import java.util.Arrays;
import java.util.function.Predicate;

public class Test3
{
    public static void main(String[] args) {

        String[] names = {"Sunny","Kajol","Mallika","Katrina","Kareena"};

        //Predicate<String> p1 = s -> s.startsWith("K");
        Predicate<String> p1 = s -> s.charAt(0)=='K';

        System.out.println("names : " + Arrays.toString(names));
        m1(p1,names);

    }

    public static void m1(Predicate<String> p , String[] s)
    {
        for(String str : s)
        {
            if(p.test(str))
                System.out.print(str + ", ");
        }
    }
}
