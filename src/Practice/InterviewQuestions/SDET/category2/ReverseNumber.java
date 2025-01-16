package Practice.InterviewQuestions.SDET.category2;

import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter a number");
        long num1 = sc.nextLong();

        //--- Logic-1 using an algorithm :

        long reverse = 0;

        while(num1 != 0)
        {
            reverse = reverse*10 + num1%10;
            num1 = num1/10;
        }

        System.out.println("Reverse of your number is  : " + reverse);

    }
}
