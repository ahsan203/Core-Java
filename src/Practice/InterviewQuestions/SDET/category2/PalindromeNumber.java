package Practice.InterviewQuestions.SDET.category2;

import java.util.Scanner;

public class PalindromeNumber
{
    public static void main(String[] args) {

        /*
                Step-1) First Reverse the number and then compare reverse-number with original-number,
                        if they are equal then it is palindrome.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int original_number = num;

        int reverse = 0;

        while(num!=0)
        {
            reverse = reverse*10 + num%10;
            num = num/10;
        }
        System.out.println("Reverse number = " + reverse);

        if(original_number==reverse)
        {
            System.out.println("it is a Palindrome-Number.");
        }
        else
        {
            System.out.println("It is not a Palindrome-Number");
        }

    }
}
