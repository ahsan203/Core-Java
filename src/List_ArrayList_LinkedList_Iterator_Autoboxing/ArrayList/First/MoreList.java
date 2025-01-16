package List_ArrayList_LinkedList_Iterator_Autoboxing.ArrayList.First;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoreList
{
    public static void main(String[] args) {

        String[] items = {"apples","bananas","milk","eggs"};
        System.out.println(Arrays.toString(items));

        List<String> list = List.of(items);
        System.out.println(list);

        System.out.println(list.getClass().getName());

        System.out.println("------------------------------------------------");

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("Yogurt");

        System.out.println(groceries);
        groceries.set(0,"Cheese");
        System.out.println(groceries);

        System.out.println("-----------------------------");

        ArrayList<String> nextList = new ArrayList<>( List.of("pickles","mustard","cheese"));
        System.out.println(nextList);

        System.out.println("-------------------------------------------------");

        groceries.addAll(nextList);
        System.out.println(groceries);
        System.out.println("-----------------------------------------------");

        System.out.println("Third-item = " + groceries.get(2));

        if(groceries.contains("mustard"))
        {
            System.out.println("List contains \"mustard\" " );
        }

        System.out.println("----------------------------------------");


        groceries.add("Yogurt");
        System.out.println("First-Yogurt = " + groceries.indexOf("Yogurt"));
        System.out.println("Last-Yogurt = " + groceries.lastIndexOf("Yogurt"));

     }
}
