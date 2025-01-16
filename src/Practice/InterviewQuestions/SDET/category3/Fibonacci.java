package Practice.InterviewQuestions.SDET.category3;

public class Fibonacci
{
    public static void main(String[] args) {

        /*
            Fibonacci = 0 1 1 2 3 5 8 13 21 ......
            step-1 : first-add n1+n2 = n3;
            step-2 : Now [n2 should become n1] and [n3 should become n2]
            step-3 : Repeat step-2 .....
         */

        int n1=0, n2=1, sum=0;

        System.out.print(n1+ " " + n2);

        for(int i=2; i<9; i++)
        {
            sum = n1+n2;
            System.out.print(" " + sum);
            n1=n2;
            n2=sum;
        }

    }
}
