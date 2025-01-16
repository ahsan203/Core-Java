package Practice.java_lang.Part2_hashCode;

public class Example1
{
    private String name;
    private int roll;

    public Example1(String name, int roll)
    {
        this.name = name;
        this.roll = roll;
    }

   /* public int hashCode()
    {
        return roll;
    }

    public String toString()
    {
        return "name : " + name + "\n" + "roll : " + roll + "\n-----------------------";
    }
*/
    public static void main(String[] args) {

        Example1 ex1 = new Example1("Ahsan",7027);
        Example1 ex2 = new Example1("Zaki", 7035);
        Example1 ex3 = new Example1("Shoeab", 7018);
        System.out.println(ex1.hashCode());
        System.out.println(ex2.hashCode());
        System.out.println(ex3.hashCode());

        System.out.println(Integer.toHexString(42));


    }
}
