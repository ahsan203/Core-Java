package Practice.InterviewQuestions.Reverse_String;

public class RevString
{
    public static void main(String[] args) {

        String s1 = "ahsan";
        System.out.println("Length : " + s1.length());
        System.out.println(s1.charAt(4));

        //------ doing reverse of above String :

        String s2 = "";
        for(int i=s1.length()-1; i>=0; i--)
        {
            s2 = s2 + s1.charAt(i);
        }

        System.out.println("Reverse of a " + s1 + " = " + s2);


    }
}
