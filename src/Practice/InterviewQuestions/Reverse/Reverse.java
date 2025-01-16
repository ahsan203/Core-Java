package Practice.InterviewQuestions.Reverse;

import java.util.Scanner;

public class Reverse
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number : ");
        int num = sc.nextInt();

        int temp=num;
        int remainder;
        int rev=0;

        while(temp!=0)
        {
                remainder = temp%10;
                rev = rev*10 + remainder;

                temp = temp/10;
        }

        System.out.println("Reverse of given number is : " + rev);
    }
}
