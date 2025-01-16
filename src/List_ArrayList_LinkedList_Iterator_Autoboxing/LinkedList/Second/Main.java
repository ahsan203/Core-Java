package List_ArrayList_LinkedList_Iterator_Autoboxing.LinkedList.Second;

import java.util.LinkedList;
import java.util.Scanner;

public class Main
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        LinkedList<Place> placesToVisit = new LinkedList<>();

        Place adelaide = new Place("Adelaide","1374");
        Place adelaide2 = new Place("Adelaide","1374");
        addPlace(placesToVisit,adelaide2);
        System.out.println(placesToVisit);

        printActions();

        switch(scanner.next())
        {

        }
    }





    private static void printActions()
    {
        String textBlock = """
                Available actions (select word for letter)
                (F)orward
                (B)ackward
                (L)ist Place
                (M)enu
                (Q)uit
                """;

        System.out.print(textBlock + " ");
    }
    private static void addPlace(LinkedList<Place> list, Place place)
    {
        if(list.contains(place))
        {
            System.out.println("Found Duplicate : " + place);
            return;
        }
        else
        {
            list.add(place);
        }
       /* list.add();
        list.add(new Place("Alice Springs","2771"));
        list.add(new Place("Brisbane","917"));
        list.add(new Place("Darwin","3972"));
        list.add(new Place("Melbourne","877"));
        list.add(new Place("Perth","3923"));

        */
    }
}
