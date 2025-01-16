package Practice.InterviewQuestions.SDET.category2;

public class PlaindromeString
{
    public static void main(String[] args) {

        String str = "abac";

        StringBuffer sb1 = new StringBuffer(str);
        StringBuffer sbReverse = sb1.reverse();
        String strReverse = sbReverse.toString();

        System.out.println("Reverse = " + strReverse);

        if(str.equals(strReverse))
        {
            System.out.println("String is Palindrome.");
        }
        else
        {
            System.out.println("String is not Palindrome.");
        }
    }
}
