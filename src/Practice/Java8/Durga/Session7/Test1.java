package Practice.Java8.Durga.Session7;

import java.util.function.Function;

public class Test1
{
    public static void main(String[] args) {

   //--------- Program to find length of String using @Function Interface

        Function<String,Integer> f1 = s1 -> s1.length();
        int result =  f1.apply("Zaid");
        System.out.println(result);


    //------------ Program to write square of given int-number -------

            Function<Integer,Integer> f2 = i1 -> i1*i1;
            System.out.println(f2.apply(5));
    }
}
