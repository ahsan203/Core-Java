package Practice.Java8.Durga.Session6;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test4
{
    public static void main(String[] args) {

        String[] names = {"Durga"," ", null, "Ravi"," ","Shiva",null};

        Predicate<String> p1 = s -> s!=null && s.length()!=0;
        m1(p1,names);




    }

    public static void m1(Predicate<String> p, String[] s)
    {
        ArrayList<String> l = new ArrayList<>();

        for(String str : s)
        {
            if(p.test(str)) {
                System.out.print(str + ", ");
                l.add(str);
            }

        }

        System.out.println();
        System.out.print("The list of valid strings : ");
        System.out.println(l);
    }
}