package Practice.InterviewQuestions.Palindrome;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter your number : ");

        int num = sc.nextInt();

        int t1=num;
        int remainder;
        int rev=0;

        while(t1!=0)
        {
            remainder = t1%10;
            rev = rev*10 + remainder;

            t1 = t1/10;
        }

        if(rev==num)
        {
            System.out.println("Given number is Palindrome.");
        }
        else
        {
            System.out.println("Given number is not a Palindrome.");
        }
    }
}
