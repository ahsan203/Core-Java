package Practice.Collection.Ankit.cursor.Enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo
{
    public static void main(String[] args) {

        Vector v = new Vector();

        for(int i=0; i<=15; i++)
        {
            v.addElement(i);
        }

        System.out.println(v);

        Enumeration e = v.elements();

        while (e.hasMoreElements())
        {
            Integer data = (Integer) e.nextElement();

            //System.out.println(data);

            if(data%2==0)
            {
                System.out.println(data);

            }
        }
    }
}
