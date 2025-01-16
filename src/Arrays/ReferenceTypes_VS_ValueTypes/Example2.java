package Arrays.ReferenceTypes_VS_ValueTypes;

import Practice.ExceptionHandling.Durga.Important_cases_throws_keyword.Exa;

public class Example2
{
    private String name;
    private int roll;

    public Example2(String name, int roll)
    {
        this.name = name;
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Example2{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                '}';
    }

    public static void main(String[] args)
    {
        Example2 ahsan = new Example2("Ahsan Shareef",7027);
        Example2 zaid = ahsan;

        System.out.println(ahsan);
        System.out.println(zaid);

        zaid.setName("Ahsan Shareef Mohammed");

        System.out.println(ahsan);
        System.out.println(zaid);





    }
}
