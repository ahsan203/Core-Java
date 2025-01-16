package Practice.ppp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student
{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " (" + age + ")";
    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class SortExample {

    public static void main(String[] args)
    {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 18));
        students.add(new Student("Charlie", 22));

        System.out.println("Original list: " + students);

       /* // Sort students by age using Comparator
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.age, s2.age);
            }
        });*/

        Collections.sort(students,(s1,s2)-> (s1.getAge()< s2.getAge()) ? -1 : (s1.getAge()> s2.getAge()) ? 1 : 0);

        System.out.println("Sorted list by age: " + students);
    }
}
