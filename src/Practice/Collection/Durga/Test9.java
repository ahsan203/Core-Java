package Practice.Collection.Durga;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Test9
{
    public static void main(String[] args) {

        List list1 = new LinkedList();

        list1.add("BalaKrishna");
        list1.add("Venki");
        list1.add("Chiru");
        list1.add("Nag");

        System.out.println("Linked-List (list1) = " + list1);

        ListIterator lt1 = list1.listIterator();

        while(lt1.hasNext())
        {
            String s = (String) lt1.next();

            if(s.equals("Venki"))
            {
                lt1.remove();
            }

            if(s.equals("Nag"))
            {
                lt1.set("Naga-Chaitanya");
            }

            if(s.equals("Chiru"))
            {
                lt1.add("Charan");
            }
        }

        System.out.println("After using List-Iterator = " + list1);
    }
}
