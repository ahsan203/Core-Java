package Practice.java_lang.Part3_equals;

public class Example5 {

    private String name;
    private int roll;

    public Example5(String name, int roll)
    {
        this.roll=roll;
        this.name=name;
    }


    public boolean equals(Object obj)
    {
        if(this==obj) return true;

        if(obj instanceof Example4)
        {
            Example5 e = (Example5) obj;
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
        Example5 e1 = new  Example5("ahsan",27);
        Example5 e2 = new  Example5("shoeab",18);
        Example5 e3 = new  Example5("ahsan",27);

        System.out.println(e1.equals(e2));
        System.out.println(e2.equals(e3));
        System.out.println(e3.equals(e1));
    }
}