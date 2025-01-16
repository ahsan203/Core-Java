package Practice.java_lang.Part3_equals;

public class Example6
{
    private String name;
    private int roll;

    public Example6(String name, int roll)
    {
        this.roll=roll;
        this.name=name;
    }


    public boolean equals(Object obj)
    {
        //--- Here we are checking if both references pointing to same object, return "true".
        if(this==obj) return true;

        //--- Here we are checking both "NullPointerException" and "ClassCastException".
        if(obj==null || getClass()!=obj.getClass()) return false;

        Example6 e = (Example6) obj;
        return (name.equals(e.name) && roll==e.roll);
    }

    public static void main(String[] args) {
        Example6 e1 = new  Example6("ahsan",27);
        Example6 e2 = new  Example6("shoeab",18);
        Example6 e3 = new  Example6("shoeab",18);

        System.out.println(e1.equals(e2));
        System.out.println(e2.equals(e3));
        System.out.println(e3.equals(e1));
    }
}
