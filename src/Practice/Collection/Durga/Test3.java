package Practice.Collection.Durga;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class Test3
{
    public static void main(String[] args) {

        List list1 = new ArrayList();
        List list2 = new LinkedList();

        System.out.println("list1 instanceof Serializable " + list1 instanceof Serializable);
        System.out.println( list1 instanceof  Cloneable);
        System.out.println(list1 instanceof RandomAccess);

        System.out.println("-----------------------------");

        System.out.println("list2 instanceof Serializable : " + list2 instanceof Serializable);
        System.out.println(list2 instanceof  Cloneable);
        System.out.println(list2 instanceof RandomAccess);


    }
}
