package Arrays;

import java.util.Scanner;

public class ScannerExample
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = sc.nextLine();

        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        System.out.println("Enter your DOB : ");
        String dob = sc.nextLine() + sc.nextLine();

        System.out.println("Enter your salary : ");
        double salary = sc.nextDouble();


        System.out.println("Your Name : " + name);
        System.out.println("Your age : " + age);
        System.out.println("Your DOB : " + dob);
        System.out.println("Your Salary : " + salary);
    }
}
