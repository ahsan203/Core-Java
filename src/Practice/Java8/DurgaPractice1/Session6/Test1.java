package Practice.Java8.DurgaPractice1.Session6;

import java.util.function.Predicate;

public class Test1
{
    public static void main(String[] args) {

        //--- Program to check whether number is greater than 10 or not

        Predicate<Integer> p = i->
        {
            if(i>10)
            {
                return true;
            }
            else
            {
                return false;
            }
        };

        p.test(12);
    }
}
