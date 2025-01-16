package Practice.InterviewQuestions.SDET.category3;

public class CountNumberOfDigits
{
    public static void main(String[] args) {

        /*-------- 1) First divide number/10 so the last number will be eliminated
                   2) Take one variable-count and increase the count-variable by 1....
         */

        int num = 1234546;
        int count=0;

        while(num>0)
        {
            num = num/10;
            count ++;
        }
        System.out.println("Number of digits = " + count);
    }
}
