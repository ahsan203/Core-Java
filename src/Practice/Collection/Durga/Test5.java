package Practice.Collection.Durga;

import java.util.LinkedList;
import java.util.List;

public class Test5
{
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.add("Ahsan");
        ll.add(30);
        ll.add(null);
        ll.add("Ahsan");
        ll.set(0,"Software");

        ll.add(0,"Shoeab");

        ll.removeLast();
        ll.addFirst("Ahsan");

        System.out.println("Linked-List(ll) : " + ll);
    }
}
