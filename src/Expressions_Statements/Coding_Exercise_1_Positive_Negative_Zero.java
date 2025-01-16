package Expressions_Statements;

public class Coding_Exercise_1_Positive_Negative_Zero
{
    public static void main(String[] args) {

        checkNumber(2);
    }

    public static void checkNumber(int number)
    {
        if(number>0)
        {
            System.out.println("positive");
        }
         if(number<0)
        {
            System.out.println("negative");
        }
        if(number==0)
        {
            System.out.println("zero");
        }
    }
}
