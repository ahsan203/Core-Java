package Practice.Collection.Ankit.cursor.Enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo2
{
    public static void main(String[] args) {

        Vector<Student> students = new Vector<>();

        Student ahsan = new Student("ahsan",7027);
        Student shoeab = new Student("shoeab",7018);
        Student zaki = new Student("zaki",7035);
        Student nomaan = new Student("nomaan",7040);
        Student muzammil = new Student("muzammil",12);
        Student faisal =new Student("faisal",89);
        Student hisham = new Student("hisahm",80);

        students.addElement(ahsan);
        students.addElement(shoeab);
        students.addElement(zaki);
        students.addElement(nomaan);
        students.addElement(faisal);
        students.addElement(muzammil);
        students.addElement(hisham);

        System.out.println(students);

        Enumeration e =students.elements();

        while(e.hasMoreElements())
        {
            Student st = (Student) e.nextElement();

            /*if(st.name=="ahsan")
            {
                System.out.println(st);
            }*/
            System.out.println(st);
        }

    }
}

