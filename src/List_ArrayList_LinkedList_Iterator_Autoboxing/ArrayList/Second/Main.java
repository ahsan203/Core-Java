package List_ArrayList_LinkedList_Iterator_Autoboxing.ArrayList.Second;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {


        ArrayList<String> grocery = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);

        while(true)
        {

            System.out.println("Enter a number...");

            int result = scanner.nextInt();  scanner.nextLine();

            if(result==0)
            {
                System.exit(1);
            }
            else if(result==1)
            {
                System.out.println("Add Grocery Item ");
                String addedGrocery = scanner.nextLine();
                grocery.add(addedGrocery);

                grocery.sort(Comparator.naturalOrder());
                System.out.print("Current grocery List = " + grocery);
            }
            else if(result==2)
            {
                System.out.println("Enter the index of Grocery Item to remove ");
                int removeIndex = scanner.nextInt(); scanner.nextLine(); //String removeItem = scanner.nextLine();

                grocery.remove(removeIndex);
                System.out.println("Current grocery List = " + grocery);


            }

        }
    }
}
