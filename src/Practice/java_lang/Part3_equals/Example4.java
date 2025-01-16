package Practice.java_lang.Part3_equals;

public class Example4
{

    private String name;
    private int roll;

    public Example4(String name, int roll)
    {
        this.roll=roll;
        this.name=name;
    }


    public boolean equals(Object obj)
    {
        if(obj instanceof Example4)
        {
            Example4 e = (Example4) obj;
            if(name.equals(e.name) && roll==e.roll)
            {
                return true;
            }
            else
            {
                return false;
            }

        }
        return false;
    }

    public static void main(String[] args) {
         Example4 e1 = new Example4("ahsan",27);
         Example4 e2 = new Example4("shoeab",18);
         Example4 e3 = new Example4("ahsan",27);

        System.out.println(e1.equals(e2));
        System.out.println(e2.equals(e3));
        System.out.println(e3.equals(e1));
    }
}
