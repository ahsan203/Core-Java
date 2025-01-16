package Practice.Java8.DurgaPractice1.Session7;

import java.util.function.Function;

public class Test1
{
    public static void main(String[] args) {

        Function<String,Integer> f = s-> s.length();

        System.out.println(f.apply("Ahsan Shareef Mohammed"));

        Function<Integer,Integer> f2 = i1->i1*i1;

        System.out.println(f2.apply(10));



        String s1 ="Durga Software Solutions Hyderabad";

        Function<String,Integer> f3 = s->
        {
         int length_of_string = s.length();
         String removed_spaces_string = s.replaceAll(" ","");
         int lenght_of_new_string = removed_spaces_string.length();

         return (length_of_string)-(lenght_of_new_string);
        };

        System.out.println(f3.apply(s1));
    }
}
