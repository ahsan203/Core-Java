package Practice.InterviewQuestions.SDET.category3;

public class CountEvenOddNumbers
{
    public static void main(String[] args) {

        int number = 1456786;

        /*
            Even = number divisible by 2.
            Odd = number not divisible by 2.
         */
        int evenCount = 0;
        int oddCount = 0;

        while(number>0)
        {
            int modulo = number%10;

            if(modulo%2==0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
            number = number/10;

        }

        System.out.println("Even-Count = " + evenCount);
        System.out.println("Odd-Count = " +oddCount);
    }
}
