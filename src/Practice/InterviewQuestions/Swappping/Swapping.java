package Practice.InterviewQuestions.Swappping;

public class Swapping
{
    public static void main(String[] args) {

        int num1 = 788;
        int num2 = 454;
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);

        int temp;

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("num1 after swapping : " + num1);
        System.out.println("num2 after swapping : " + num2);
    }
}
