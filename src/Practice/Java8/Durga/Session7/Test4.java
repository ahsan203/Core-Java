package Practice.Java8.Durga.Session7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Student
{
    String name;
    int marks;

    Student(String name, int marks)
    {
        this.name = name;
        this.marks = marks;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public int getMarks()
    {
        return marks;
    }
    public void setMarks(int marks)
    {
        this.marks=marks;
    }

    public String toString()
    {
        return "(" +name + " scored " + marks+" marks )";
    }
}

public class Test4
{
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        populate(list);
        System.out.println(list);

        Function<Student,String> f1 = student -> {

            if(student.getMarks()>=80)
            {
                return "Distinction : A Grade";
            }
            else if(student.getMarks()>=60)
            {
                return "First-Class : B Grade";
            }
            else if(student.getMarks()>=50)
            {
                return "Second-Class : C Grade";
            }
            else if(student.getMarks()>=35)
            {
                return "Third-Class : D Grade";
            }
            else
            {
                return "Failed : E Grade";
            }
        };




        for(Student st : list)
        {
            System.out.print(st + " : Result-> ");
            System.out.println(f1.apply(st));
        }

        System.out.println("-----------------------------------------");

        Predicate<Student> p1 = s-> s.getMarks()>=60;

        for(Student stu : list)
        {
            if(p1.test(stu))
            {
                System.out.println(stu + " : Result-> " + f1.apply(stu));
            }
        }

    }

    public static void populate(List<Student> list)
    {
        list.add(new Student("Sunny",100));
        list.add(new Student("Bunny",65));
        list.add(new Student("Chinny",55));
        list.add(new Student("Vinny",45));
        list.add(new Student("Pinny",25));
    }
}
