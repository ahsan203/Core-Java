package Practice.InterviewQuestions.SDET.category3;

import java.util.Scanner;

public class FindLargestNumber
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        int a  = sc.nextInt();

        System.out.println("Enter Second Number");
        int b = sc.nextInt();

        System.out.println("Enter Third Number");
        int c = sc.nextInt();


        //--- Logic-1 :
        if(a>b && a>c) System.out.println(a+" is largest of all three.");
        else if (b>a && b>c) System.out.println(b+" is largest of all three.");
        else if (c>a && c>b) System.out.println(c +" is largest of all three.");

        System.out.println("--------------------------------------------------");

        //--- Logic-2 -> Ternary operator

        int largest1 = a>b ? a:b;

        int largest2 = largest1>c ? largest1 : c ;

        System.out.println(largest2 + " is big among three numbers");


    }
}
