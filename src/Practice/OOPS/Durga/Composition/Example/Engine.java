package Practice.OOPS.Durga.Composition.Example;

import java.lang.reflect.Method;

public class Engine
{
    public void v8Engine()
    {

    }

    public void v6Engine()
    {

    }

    public void fourCylinder()
    {

    }

    public static void main(String[] args) throws ClassNotFoundException {

        Class c = Class.forName("Practice.OOPS.Durga.Composition.Example.Engine");
        Method[] m = c.getDeclaredMethods();

        int count=0;
        for(Method m1 : m)
        {
            System.out.println(m1.getName());
            count++;
        }
        System.out.println("Number of methods : "+count);

    }
}
