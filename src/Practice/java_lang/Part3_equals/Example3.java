package Practice.java_lang.Part3_equals;

public class Example3
{
    private String name;
    private int roll;

    public Example3(String name, int roll)
    {
        this.roll=roll;
        this.name=name;
    }

    public boolean equals(Object obj)
    {
        try {
        Example3 ex3 = (Example3)obj;


            if (name.equals(ex3.name) && (roll == ex3.roll)) {
                return true;
            } else {
                return false;
            }
        }
        catch (ClassCastException cce) { return  false; }
        catch (NullPointerException npe) { return  false; }
    }

    public static void main(String[] args) {

        Example3 s1 = new Example3("Ahsan",7027);
        Example3 s2 = new Example3("Shoeab",7018);
        Example3 s3 = new Example3("Ahsan", 7027);
        Example3 s4 = s1;

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));

        System.out.println(s1.equals("Ahsan")); //----------- ClassCastException ----------

        System.out.println(s1.equals(null)); // ------------ NullPointerException --------------
    }
}
