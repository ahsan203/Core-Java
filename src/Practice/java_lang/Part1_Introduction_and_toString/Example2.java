package Practice.java_lang.Part1_Introduction_and_toString;

public class Example2
{
    private String name;
    private int roll;

    public Example2(String name, int roll)
    {
        this.name=name;
        this.roll=roll;
    }

//--- Below is the default implementation of toString() inside Object-class:
    public String toString()
    {
        return getClass().getName()+"@"+Integer.toHexString(hashCode())+"@";
    }
    /*public String toString()
    {
        return "name : " + name + "\n" + "roll-number : " + roll + "\n------------------------";
    }
*/
    public static void main(String[] args) {

        Example2 ex1 = new Example2("Ahsan Shareef",7027);
        System.out.println(ex1.toString());
        Example2 ex2 = new Example2("Shoeab Ansari",7018);
        Example2 ex3 = new Example2("Zaki",7035);

        System.out.println(ex1);
        System.out.println(ex2);
        System.out.println(ex3);
    }
}
