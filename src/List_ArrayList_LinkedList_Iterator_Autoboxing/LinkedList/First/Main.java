package List_ArrayList_LinkedList_Iterator_Autoboxing.LinkedList.First;

import java.util.*;

public class Main
{
    public static void main(String[] args) {

        //LinkedList<String> placesToVisit = new LinkedList<>();

        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        removeElements(placesToVisit);
        System.out.println(placesToVisit);

        gettingElements(placesToVisit);

        System.out.println("----------------");
        printItinerary(placesToVisit);
        System.out.println("----------------------");

        String[] newPlaces = {"Chicago","Atlantic City","Niagara Falls","Canada","Texas","California","Florida"};
        List newList = Arrays.asList(newPlaces);
        LinkedList<String> placesToVisit2 = new LinkedList<>(newList);

        printItinerary3(placesToVisit2);
        System.out.println("-------------------------------------");

        System.out.println(placesToVisit2);
        testIterator(placesToVisit2);


    }

    public static void addMoreElements(LinkedList<String> list)
    {
            list.addFirst("Darwin");
            list.addLast("Hobart");

       //--- Queue Methods :

            list.offer("Melbourne");
            list.offerFirst("Brisbane");
            list.offerLast("Toowoomba");


       // --- Stack Methods :
       list.push("Alice Springs");

    }


    private static void removeElements(LinkedList<String> list)
    {
        list.remove(4);
        list.remove("Brisbane");

        list.poll(); // remove first element i.e "Alice Springs"

        list.pollFirst(); // Again removing first element i.e. "Darwin"

        list.pollLast(); // remove Last element i.e. "Toowoomba";

        list.pop(); // remove first element i.e. "Canberra"
    }


    private static void gettingElements(LinkedList<String> list)
    {
        System.out.println("Retrieving Element 1 : " + list.get(1));
        System.out.println("First Element : " + list.getFirst());
        System.out.println("Last Element : " + list.getLast());

        System.out.println("Melbourne is at position : " + list.indexOf("Melbourne"));
    }

    public static void printItinerary(LinkedList<String> list)
    {
        System.out.println("Trip starts at : " + list.getFirst());
        System.out.println("Trip ends at : " + list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list)
    {
        System.out.println("Trip starts at : " + list.getFirst());

      ListIterator<String> iterator = list.listIterator(1);

     String previousPlace =  list.getFirst();

      while(iterator.hasNext())
      {
          var place = iterator.next();
          System.out.println("--> From : " + previousPlace + " to " + place);
          previousPlace = place;
      }

        System.out.println("Trip ends at : " + list.getLast());
    }

    private static void testIterator(LinkedList<String> list)
    {
        var iterator = list.iterator();

        while(iterator.hasNext())
        {
            //System.out.println(iterator.next());

            if(iterator.next().equals("Canada"))

                iterator.remove();

        }
        System.out.println(list);
    }
}
