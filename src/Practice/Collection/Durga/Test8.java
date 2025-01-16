package Practice.Collection.Durga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test8
{
    public static void main(String[] args) {

        List al1 = new ArrayList();

        for(int i=0; i<=10; i++)
        {
            al1.add(i);
        }

        System.out.println("Array-List (al1) = " + al1);


       Iterator it1 = al1.iterator();

       while(it1.hasNext())
       {
           Integer num = (Integer) it1.next();

           System.out.print(num + ", ");

           if(num%2==0)
           {
               it1.remove();

           }
       }
        System.out.println();
        System.out.println("After removing even-numbers = " + al1);
    }
}
