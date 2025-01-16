package Practice.File_IO.Telusko;

import java.util.Scanner;

public class Input_Using_Scanner
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your roll : ");
        long roll = scan.nextLong();
        scan.nextLine();

        System.out.println("Enter your name : ");
        String name = scan.nextLine();

        System.out.println("Enter your City : ");
        String city = scan.nextLine();

        System.out.println("Enter weight in lbs : ");
        double weight = scan.nextDouble();
        scan.nextLine();

        System.out.println("Enter University : ");
        String university = scan.nextLine();

        System.out.println("Name : " + name);
        System.out.println("roll : " + roll);
        System.out.println("City : " + city);
        System.out.println("Weight : " + weight + " lbs");
        System.out.println("University : " + university);
    }
}
