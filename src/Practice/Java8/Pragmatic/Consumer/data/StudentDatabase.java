package Practice.Java8.Pragmatic.Consumer.data;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase
{
    public static List<Student> getAllStudents()
    {
        //--- 2nd Grade Students :
        Student student1 = new Student("Adam",2,3.6,"male");
        Student student2 = new Student("Jenny",2,3.8,"female");

        //--- 3rd grades students:
        Student student3 = new Student("Emily",3,4.0,"female");
        Student student4 = new Student("Dave",3,3.9,"male");

        //--4th grade students :
        Student student5 = new Student("Sophia",4,3.5,"female");
        Student student6 = new Student("James",4,3.9,"female");

        List<Student> students = Arrays.asList(student1,student2,student3,student4,student5,student6);

        return students;

    }
}
