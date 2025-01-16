package Practice.InnerClasses.Durga.Part1;

public class Outer3
{
    class Inner3
    {
        public void m1()
        {
            System.out.println("Inner-3 class method...");
        }
    }

    public void m2()
    {
        Inner3 i3 = new Inner3();

        i3.m1();
    }

    public static void main(String[] args) {
       Outer3 o3 = new Outer3();
       o3.m2();
    }
}
