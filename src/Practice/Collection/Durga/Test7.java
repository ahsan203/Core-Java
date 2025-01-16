package Practice.Collection.Durga;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class Test7
{
    public static void main(String[] args) {

        Vector v1 = new Vector<>();

        for(int i=0; i<=10; i++)
        {
            v1.addElement(i);
        }

        System.out.println("Vector v1 : " + v1);

        Enumeration e1 = v1.elements();

        while(e1.hasMoreElements())
        {
            Integer I = (Integer) e1.nextElement();

            if(I%2==0) {
                System.out.print(I + ", ");
            }
        }
        System.out.println();
        System.out.println("---------------------------------");

        Stack s1 = new Stack();

        s1.push("Mohammed Ahsan Shareef");
        s1.push("Shoeab");
        s1.push("Zaki");
        s1.push("Nomaan");
        s1.push("Muzammil");
        s1.push("Ismail");
        s1.push("Hisham");

        System.out.println("Stack s1 = " + s1);

        Enumeration e2 = s1.elements();

        while(e2.hasMoreElements())
        {
            String name = (String) e2.nextElement();

            if(name.startsWith("M"))
            {
                System.out.print(name + ", ");
            }
        }

    }
}
