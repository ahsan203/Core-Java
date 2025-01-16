package Practice.Collection.Ankit.cursor.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo
{
    public static void main(String[] args) {

        List l =new ArrayList();



        for(int i=0; i<=20; i++)
        {
            l.add(i);
        }

        System.out.println(l);

        Iterator itr = l.iterator();

        while(itr.hasNext())
        {
            Integer data = (Integer) itr.next();
           // System.out.println(data);

            if(data%2!=0)
            {
                System.out.println(data);
                itr.remove();

            }

        }
        System.out.println(l);


    }
}
