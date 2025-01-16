package Practice.Java8.DurgaPractice1.Session3;

import java.util.TreeSet;

public class Test2
{
    public static void main(String[] args)
    {
        TreeSet<Integer> ts1 = new TreeSet<>((i1,i2)->
        {
            if (i1>i2)
            {
                return -1;
            }
            else if(i1<i2)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        });
        ts1.add(10);
        ts1.add(0);
        ts1.add(15);
        ts1.add(25);
        ts1.add(5);
        ts1.add(20);

        System.out.println("C.S.O = " + ts1);


    }
}
