package Practice.Java8.Durgesh.Streams;

import java.util.Arrays;
import java.util.List;

public class Test1
{
    public static void main(String[] args) {

        List<Integer> list1 = List.of(23, 56, 78, 90, 99, 67, 98, 78);
        System.out.println("list-1 before-modification : " + list1);
        /*list1.add(34);
        list1.set(1,58);
        System.out.println("list-1 after-modification : " + list1);
*/
        List<Integer> list2 = Arrays.asList(56,55,54,59,58,57,null);
        System.out.println("list-2 before-modification : " + list2);
       //list2.add(52);
        list2.set(1,95);
        list2.set(6,88);
        //list2.replaceAll();
        System.out.println("list-2 after-modification : " + list2);

    }
}
