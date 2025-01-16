package Practice.Java8.Durga.Session6;

import java.util.Arrays;
import java.util.function.Predicate;

public class Test2
{
    public static void main(String[] args) {

//-------- Program

            int[] x ={0,5,10,15,20,25,30};

        Predicate<Integer> p1 = i1 -> i1>10;
        Predicate<Integer> p2 = i1 -> i1%2==0;

        System.out.println("Numbers : " + Arrays.toString(x));
        System.out.print("The numbers which are greater than 10 : ");
        m1(p1,x);
        System.out.println();
        System.out.println("------------------------------------------------");

        System.out.println("Numbers : " + Arrays.toString(x));
        System.out.print("Even Numbers : ");
        m1(p2,x);
        System.out.println();
        System.out.println("------------------------------------------------");

        System.out.println("Numbers : " + Arrays.toString(x));
        System.out.print("The numbers which are Not-Greater than ten : ");
        m1(p1.negate(),x);
        System.out.println();
        System.out.println("------------------------------------------------");

        System.out.println("Numbers : " + Arrays.toString(x));
        System.out.print("The numbers which are Greater than 10 & Even are : ");
        m1((p1.and(p2)),x);
        System.out.println();
        System.out.println("------------------------------------------------");

        System.out.println("Numbers : " + Arrays.toString(x));
        System.out.print("The numbers which are Greater than 10 OR Even are : ");
        m1((p1.or(p2)),x);
        System.out.println();
        System.out.println("------------------------------------------------");

    }

    public static void m1(Predicate<Integer> p, int[] x)
    {
        for(int x1 : x)
        {
            if(p.test(x1))
            System.out.print(x1 + ", ");
        }
    }
}
