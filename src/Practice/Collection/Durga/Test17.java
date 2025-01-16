package Practice.Collection.Durga;

import java.util.*;

public class Test17
{
    public static void main(String[] args) {

        Map m = new HashMap();

        m.put("chiranjeevi",700);
        m.put("balaiah",800);
        m.put("Venkatesh",200);
        m.put("Nagarjuna",500);

        System.out.println("All Entries of Map = " + m);
        System.out.println("Returned old-value = " + m.put("chiranjeevi",1000));

        Set keySet = m.keySet();
        System.out.println("Keys-Set = " + keySet);

        Collection valuesSet = m.values();
        System.out.println("Value-Set = " + valuesSet);

        Set entrySet = m.entrySet();
        System.out.println("Entry-Set = " + entrySet);


        System.out.println("---------------------------------------------");
        System.out.println("----------------------------------------------");
        System.out.println("----- \"Now-we are using Entry-specific methods\" -----");

        Iterator itr1 = entrySet.iterator();
        while(itr1.hasNext())
        {
            Map.Entry m1 = (Map.Entry) itr1.next();

            System.out.println(m1.getKey() + "-----" + m1.getValue());

            if(m1.getKey().equals("Nagarjuna"))
            {
                m1.setValue(1000);
            }
        }

        System.out.println("All Entries of Map = " + m);


    }
}
