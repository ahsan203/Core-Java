package Practice.InterviewQuestions.SDET.category3;

public class SumOfDigits
{
    public static void main(String[] args) {

        int number  = 12345;

        int sum=0;

        while(number>0)
        {
            int modulo = number%10;
            sum = sum+modulo;
            number = number/10;
        }

        System.out.println("Sum = " + sum);
    }
}
