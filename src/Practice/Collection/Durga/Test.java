package Practice.Collection.Durga;

import java.util.Arrays;

class Student
{

}

class Employee
{

}
public class Test
{
    public static void main(String[] args) {

        Object[] obj1 = new Object[20];

        obj1[0] = new Student();
        obj1[1] = new Student();
        obj1[2] = new Employee();
        //obj1[21] = new Student();

        System.out.println(Arrays.toString(obj1));
        System.out.println(obj1[2]);
    }
}
