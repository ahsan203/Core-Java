package Practice.Java8.DurgaPractice2.Function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class GradeStudent
{
    private String name;
    private int marks;

    public GradeStudent() {
    }

    public GradeStudent(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "GradeStudent{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

class Test
{
    public static void main(String[] args) {

        ArrayList<GradeStudent> list = new ArrayList<>();
        populateList(list);
        System.out.println(list);

        //--- Function to check Students-Grade :

        Function<GradeStudent,String> f1 = student->
                student.getMarks()>=80?"Distinction":
                        student.getMarks()>=60?"First":
                                student.getMarks()>=50?"Second":
                                        student.getMarks()>35?"Third":"Failed";



        for(GradeStudent s  : list)
        {
            System.out.println(s.getName() + " : " +f1.apply(s));
            System.out.println("-----");
        }

        System.out.println("------------------------------------------------------------");

        //---- Using Predicate and Function together:
        Predicate<GradeStudent> p1 = student-> student.getMarks()>=60;

        for(GradeStudent s : list)
        {
            if(p1.test(s)) {
                System.out.println(s.getName() + " : " + f1.apply(s));
            }
        }
    }

    public static void populateList(ArrayList<GradeStudent> list)
    {
        list.add(new GradeStudent("Sunny",100));
        list.add(new GradeStudent("Bunny",65));
        list.add(new GradeStudent("Chinny",55));
        list.add(new GradeStudent("Vinny",45));
        list.add(new GradeStudent("Pinny",25));
    }


}
