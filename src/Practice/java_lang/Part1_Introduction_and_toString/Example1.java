package Practice.java_lang.Part1_Introduction_and_toString;

import java.lang.reflect.Method;

public class Example1
{
    public static void main(String[] args) throws ClassNotFoundException{

        Class c = Class.forName("java.lang.Object");
        Method[] m = c.getDeclaredMethods();

        int count=0;

        for(Method m1 : m)
        {
            System.out.println(m1.getName());
            System.out.println(m1.getAnnotatedReturnType());
            System.out.println("-------------");
            count++;
        }

        System.out.println("Total number of methods() in Object-class is : " + count);


    }
}
