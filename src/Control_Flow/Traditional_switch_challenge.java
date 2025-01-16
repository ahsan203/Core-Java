package Control_Flow;

public class Traditional_switch_challenge
{
    public static void main(String[] args)
    {
        String c = nato('C');
        String a = nato('A');
        String r = nato('R');
        System.out.println(c+a+r);
    }

    public static String nato(char alphabet)
    {

        switch (alphabet)
        {
            case 'A' :
                return "Able ";
                //break; return itself act as a break statement............

            case 'B' : return "Baker ";

            case 'C' : return "Charlie ";

            case 'R': return "Roger ";

            default:
            {
                return "Please enter valid alphabet";
            }
        }

    }
}
