package Practice.Java8.Pragmatic.Consumer;

import Practice.Java8.Pragmatic.Consumer.data.Student;
import Practice.Java8.Pragmatic.Consumer.data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumeExample
{

    public static void printName()
    {
        Consumer<Student> c2 = (student) -> System.out.println(student.getName());
        List<Student> studentList = StudentDatabase.getAllStudents();

        studentList.forEach(c2);
    }

    public static void printGrade()
    {
        Consumer<Student> c3 = (student) -> System.out.println(student.getName());

        List<Student> studentList = StudentDatabase.getAllStudents();

        studentList.forEach(student-> {
            if(student.getGradeLevel()>=3)
            {
                c3.accept(student);
            }
        });
    }
    public static void main(String[] args) {

        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());

        c1.accept("java8");

        printName();

        System.out.println("----------------");

        printGrade();



    }
}
