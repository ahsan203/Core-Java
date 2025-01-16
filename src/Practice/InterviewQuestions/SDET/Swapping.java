package Practice.InterviewQuestions.SDET;

public class Swapping
{
    public static void main(String[] args) {
        int a=10,b=20;

        //---- Logic-1: Here we are using a third-variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("----------------------------");

        //---- Logic-2 : Here we use + and - operator
        a = a+b;
        b=a-b;
        a=a-b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("----------------------------");

        //--- Logic-3 : Here we use * and / operator
        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("----------------------------");

        //--- Logic-5 : Using single statement
        b=a+b-(a=b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
