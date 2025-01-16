package Practice.Java8.DurgaPractice1.Session6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Lecture32
{
    public static void main(String[] args) {

        //----- Program to Remove null values and Empty String from given List :

        String[] names = {"Durga","",null,"Ravi","","Shiva",null};

        //--- Removing null values from String and checking empty string:
        Predicate<String> p1 = s->s!=null && s.length()!=0;

        List<String> list1 = new ArrayList<>();

        for(String s1 : names)
        {
            if(p1.test(s1))
            {
                list1.add(s1);
            }
        }

        System.out.println("Lecture32");
        System.out.println(list1);



    }
}

class Lecture321
{
    public static void main(String[] args) {

        String[] names = {"Durga","",null,"Ravi","","Shiva",null};

        Predicate<String> p1 = s->s!=null;

        Predicate<String> p2 = s->s.length()!=0;

        List<String> list1 = new ArrayList<>();

        for(String s1 : names)
        {
            if(p1.test(s1)==true && p2.test(s1)==true)
            {
                list1.add(s1);
            }
        }

        System.out.println("Lecture321");
        System.out.println(list1);

    }
}