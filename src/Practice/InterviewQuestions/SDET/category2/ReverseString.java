package Practice.InterviewQuestions.SDET.category2;

public class ReverseString
{
    public static void main(String[] args) {

        /* --- First-way : Using Concatenation methodology: ---> 1) First find length of String-Object. using length()
                                                                 2) Use charAt() method inside for-loop
                                                                 3) Iterate for-loop from backside of String. */

        String s1 = "Zaid";

        int length = s1.length();

        String reverse = "";

        for(int i=length-1;i>=0;i--)
        {
            reverse = reverse + s1.charAt(i);
        }

        System.out.println("Reverse String  = " + reverse);


        //---- Second way : using char[]----------

        String s2 = "ahsan";
        char[] ch = s2.toCharArray();

        int lenght_array = ch.length;

        String rev = "";
        for(int i=lenght_array-1; i>=0; i--)
        {
            rev = rev+ch[i];
        }
        System.out.println("Reverse String-2 = " + rev);


        //------- THird way using StringBuffer: ----------This is Recommended and easy
        String s3 = "Organic";

        StringBuffer sb1  = new StringBuffer(s3);
        System.out.println("Reverse String 3 = " + sb1.reverse());
    }
}
