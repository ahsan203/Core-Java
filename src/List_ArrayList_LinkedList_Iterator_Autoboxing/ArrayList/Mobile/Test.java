package List_ArrayList_LinkedList_Iterator_Autoboxing.ArrayList.Mobile;

import java.util.ArrayList;

public class Test
{
    static ArrayList<Contact> myContacts = new ArrayList<>();

    public static void main(String[] args) {

        Contact c = Contact.createContact("Ahsan","201-982-3527");

        System.out.println(c);

        System.out.println(myContacts);

    }

}
