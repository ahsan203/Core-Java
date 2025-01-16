package List_ArrayList_LinkedList_Iterator_Autoboxing.ArrayList;

import java.util.*;

public class Challenege1
{

    static List<Grocery> list = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Press 0  to shutdown");
        int shutdown = scanner.nextInt();


        System.out.println("Press 1 to add number of items in list:");
        int adding = scanner.nextInt();
        addItems(adding);



        System.out.println("Press 2 to remove items from list:");
        int removing= scanner.nextInt();
        removeItems(removing);





    }

    public static void addItems(int result)
    {
        if(result==1)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please add items in list, delimited by , ");
            String items = scanner.nextLine();
            String[] item1 = items.split(",");

            for(String s : item1)
            {
                list.add(new Grocery(s));
            }

            System.out.println("Updated-List: " + list);

        }

    }

    public static void removeItems(int result)
    {
        if(result==2)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please remove items in list, delimited by , ");
            String items = scanner.nextLine();

            if(list.contains(items))
            {
                list.remove(items);
            }

            System.out.println("Updated-List: " + list);
        }

    }
}
