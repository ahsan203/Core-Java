package List_ArrayList_LinkedList_Iterator_Autoboxing.ArrayList.Mobile;

import java.util.ArrayList;

public class MobilePhone
{
    private String myNumber;

    ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber)
    {
        this.myNumber = myNumber;
        this.myContacts= new ArrayList<>();
    }


    public boolean addNewContact(Contact c)
    {
        int index = findContact(c);
        if(index>=0)
        {
            System.out.println("Contact already exist");
            return false;
        }
            myContacts.add(c);
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact)
    {
        int position = findContact(oldContact);
        if(position>=0)
        {
            Contact updatedContact = myContacts.set(position,newContact);
            System.out.println(updatedContact + " has been updated successfully");
        }
        return false;
    }

    public boolean removeContact(Contact c)
    {
        if(findContact(c)>=0)
        {
            myContacts.remove(c);
            System.out.println("Contact remove successfully");
            return true;
        }
        return false;
    }

    public int findContact(Contact con)
    {
        return myContacts.indexOf(con);
    }

    public int findContact(String checkName)
    {
        for(int i=0; i<myContacts.size(); i++)
        {
           Contact c =  myContacts.get(i);

           if(c.getName().equals(checkName))
           {
               return i;
           }
        }
        return -1;
    }

    public Contact queryContact(String name)
    {
        int position = findContact(name);

        if(position>=0)
        {
            return myContacts.get(position);
        }
        return null;

    }

    public void printContacts()
    {
        System.out.println("Contact List : ");

        for(int i=0; i<myContacts.size(); i++)
        {
            System.out.println((i+1) + ". "+ myContacts.get(i).getName()+ " -> "+ myContacts.get(i).getPhoneNumber());
        }
    }
}
