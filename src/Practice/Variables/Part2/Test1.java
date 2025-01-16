package Practice.Variables.Part2;

public class Test1
{
    public static void main(String[] args) {

        try {
            int j = Integer.parseInt("ten");
            System.out.println(j);
        }
        catch (NumberFormatException n)
        {
            int j = 10;
            System.out.println(j);
        }

        //System.out.println(j);

    }
}
