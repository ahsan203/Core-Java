package Practice.Collection.Ankit.Comparable_vs_Comparator.Durgesh.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeDemo
{
    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();

        emp.add(new Employee("ahsan","27",7027));
        emp.add(new Employee("shoeab","28",7018));
        emp.add(new Employee("zaki","26",7035));
        emp.add(new Employee("nomaan","23",7040));
        emp.add(new Employee("muzammil","25",7014));

        System.out.println(emp);

        //Collections.sort(emp);

    // ------ As we cannot use Collections.sort() for sorting(comparing) object's as we have multiple properties in the objects...
    //------ To sort in this situation we have to use Comparable(I) and Comparator(I) -----------


    /*--------- Implementing Comparable(I) -------------
    Steps:
    (1) First implement Comparable(I) on the object class....
    (2) In Comparable(I) it has one method i.e. compareTo() which has to override...
    (3) And write logic for comparison in the compareTo().

     */
    // -------- After Comparable(I) logic ------------
        Collections.sort(emp);
        System.out.println(emp);




    //----------------------  Have used Iterator-CURSOR below ----------------


        Iterator itr = emp.iterator();

        while(itr.hasNext())
        {
            Employee data = (Employee) itr.next();
            System.out.println(data);

           // if(data.empId==7027)
            //{
           //     System.out.println("You are Ahsan Shareef Mohammed");
            //}

           /* switch (data.empId)
            {
                case 7027 :  System.out.println("You are Ahsan Shareef Mohammed");
                break;

                case 7018 :
                    System.out.println("Mohammed Shoeab Ullah Ansari");
                    break;
                case 7035 :
                    System.out.println("Zaki Rana Qurram");
                    break;

                case 7040 :
                    System.out.println("Mohammed Waseem Uddin");
                    break;

                case 7014 :
                    System.out.println("Mohammed Muzammil");
                    break;

                default :
                    System.out.println("Error");
            }
            */

        }




    }
}
