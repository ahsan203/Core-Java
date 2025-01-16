package Practice.java_lang.Part3_equals;

import java.util.Objects;

public class Example1
{
    String name;
    int roll;

    public Example1(String name, int roll)
    {
         this.name = name;
         this.roll = roll;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Example1 example1 = (Example1) o;
        return roll == example1.roll && Objects.equals(name, example1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, roll);
    }

    public static void main(String[] args) {

        Example1 s1 = new Example1("Ahsan",7027);
        Example1 s2 = new Example1("Shoeab",7018);
        Example1 s3 = new Example1("Zaki",7035);
        Example1 s4 = s1;

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4)); // true : As Reference-number is same for both s1 and s4 objects.
    }
}
