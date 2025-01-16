package Practice.Collection.Ankit.List;

import java.util.List;
import java.util.Vector;

public class VectorDemo
{
    public static void main(String[] args)
    {

        List v = new Vector();

        for(int i=0; i<=10; i++)
        {
            v.add(i);
        }

        System.out.println(v);

        System.out.println("Vector's size : "+v.size());
    }
}
