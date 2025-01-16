package Practice.String_StringBuffer_StringBuilder.String;

import java.util.Scanner;

public class Example5
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name:");

        String name = scan.nextLine().trim();

        if(name.equalsIgnoreCase("Shoeab Ullah Ansari"))
        {
            System.out.println("Melbourne");
        }
        else if(name.equalsIgnoreCase("Hisham Muzaffar"))
        {
            System.out.println("Riyadh");
        }
        else if(name.equalsIgnoreCase("Ahsan Shareef Mohammed"))
        {
            System.out.println("Bloomingdale");
        }
        else
        {
            System.out.println("Please enter valid full name.");
        }

    }
}
