package Practice.Java8.DurgaPractice1.Session3;

import java.util.ArrayList;
import java.util.Collections;

public class Test1
{
    public static void main(String[] args) {

        //---- Using Comparator-Interface for Customized Sorting

        /*public int compare(Object o1, Object o2)
        {
            return o1.compareTo(o2);
        }*/

        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(0);
        al1.add(15);
        al1.add(5);
        al1.add(20);
        System.out.println("Before Sorting = " + al1);

        Collections.sort(al1);
        System.out.println("After Sorting (D.N.S.O) = " + al1);

        Collections.sort(al1,(I1,I2)->
        {
            if(I1>I2)
            {
                return -1;
            }
            else if(I1<I2)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        });
        System.out.println("After Sorting (C.S.O) = " + al1);
    }
}
