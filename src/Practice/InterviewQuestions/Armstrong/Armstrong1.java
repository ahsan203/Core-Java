package Practice.InterviewQuestions.Armstrong;

import java.util.Scanner;

public class Armstrong1
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();

        //------- Step-1 : First find length of the given number

        int t1=num; int length=0;

        while(t1!=0)
        {
            t1=t1/10;
            length = length + 1;
        }

        System.out.println("Length of given number : " + length);


        //------- Step-2 : Reverse and find armstrong :

        int t2=num;
        int remainder;
        int armstrong=0;

        while(t2!=0)
        {
            remainder = t2%10;
            int multiplier = 1;

            for(int i=0; i<length; i++)
            {
                multiplier = multiplier * remainder;
            }

            armstrong = armstrong + multiplier;

            t2=t2/10;
        }

        if(armstrong==num)
        {
            System.out.println(num + " is an Armstrong.");
        }
        else
        {
            System.out.println(num + " is not an Armstrong.");
        }
    }
}