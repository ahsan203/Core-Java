package Practice.File_IO.Telusko;

import java.util.Scanner;

public class Next_VS_NextLine
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your favourite color : ");
        String color = sc.next();
        sc.nextLine();

        System.out.println("Enter your Name : " );
        String name = sc.nextLine();

        System.out.println("Name : " + name);
        System.out.println("Color : " + color);
    }
}
