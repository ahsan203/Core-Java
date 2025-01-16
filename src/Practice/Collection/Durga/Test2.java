package Practice.Collection.Durga;

import java.util.ArrayList;
import java.util.List;

public class Test2
{
    public static void main(String[] args) {



            List al = new ArrayList();
            al.add("Ahsan");
            al.add(1, "Shoeab");
            al.add("Zaki");
            al.add(2, "Nomaan");

            System.out.println("Array-List-size : " + al.size());

            al.add("Muzammil");
            al.add("Hisham");
            al.add("Hisham");
            al.add("Ismail");



            System.out.println("Array-List : " + al);
            System.out.println("Array-List-size : " + al.size());

            System.out.println("indexOf() : " + al.indexOf("Hisham"));
            System.out.println("lastIndexOf() : " + al.lastIndexOf("Hisham"));

            System.out.println("Is Array-List is empty? " + al.isEmpty());

            al.clear();
            System.out.println("Array-List : " + al);



    }
}
