package Practice.Java8.Durga.Session6;

import java.util.function.Predicate;

class SoftwareEngineer
{
    int age;
    String name;
    boolean isHavingGf;

    public SoftwareEngineer(int age, String name, boolean isHavingGf)
    {
        this.age=age;
        this.name=name;
        this.isHavingGf=isHavingGf;
    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public boolean getHavingGf()
    {
        return isHavingGf;
    }

    public void setHavingGf(boolean isHavingGf)
    {
        this.isHavingGf=isHavingGf;
    }

    public String toString()
    {
        return name;
    }
}
public class Test6
{

    public static void main(String[] args) {

        SoftwareEngineer ahsan = new SoftwareEngineer(28,"ahsan",false);
        SoftwareEngineer shoeab = new SoftwareEngineer(29,"Shoeab",true);
        SoftwareEngineer zaki = new SoftwareEngineer(28,"zaki",true);

        SoftwareEngineer[] list = {ahsan,shoeab,zaki};

        Predicate<SoftwareEngineer> p1 = se -> (se.getAge()>=18) && (se.getHavingGf()==true);


        for(SoftwareEngineer se : list)
        {
            if(p1.test(se))
            {
                System.out.print(se);
                System.out.println(" : You can go to Pub");
            }
            else
            {
                System.out.print(se);
                System.out.println(" : You Cannot go to Pub.");
            }
        }


    }
}
