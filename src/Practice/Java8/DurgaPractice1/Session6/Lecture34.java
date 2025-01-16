package Practice.Java8.DurgaPractice1.Session6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class SoftwareEngineer
{
    String name;
    int age;
    boolean isHavingGF;

    SoftwareEngineer(String name,int age, boolean isHavingGF)
    {
        this.name = name;
        this.age = age;
        this.isHavingGF = isHavingGF;
    }

    public String toString()
    {
        return name;
    }
}
public class Lecture34
{
    public static void main(String[] args) {

       SoftwareEngineer[] list = {new SoftwareEngineer("Durga",60,false),
                                  new SoftwareEngineer("Sunil",25,true),
                                  new SoftwareEngineer("Sayan",26,true),
                                  new SoftwareEngineer("Subbu",28,false),
                                  new SoftwareEngineer("Ravi",17,true)
       };

       List<SoftwareEngineer> updatedList = new ArrayList<>();

       Predicate<SoftwareEngineer> p1 = seList->seList.isHavingGF==true && seList.age>18;

       for(SoftwareEngineer se : list)
       {
           if(p1.test(se))
           {
                updatedList.add(se);
           }
       }

        System.out.println("Allowed in pub = " + updatedList);
    }
}
