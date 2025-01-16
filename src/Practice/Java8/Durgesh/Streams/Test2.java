package Practice.Java8.Durgesh.Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2
{
    public static void main(String[] args) {

        List list1 = List.of(24,56,79,87,90,66);
        System.out.println("List-1 : " + list1);

        Stream<Integer> stream = list1.stream();
        List<Integer> evenList1 = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("Even-List-1 : " +evenList1);

        Stream<Integer> stream2 = list1.stream();
        List<Integer> List_75 = stream2.filter(i -> i>75).collect(Collectors.toList());
        System.out.println("List > 75 : " + List_75);
    }
}
