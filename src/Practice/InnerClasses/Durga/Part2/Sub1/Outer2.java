package Practice.InnerClasses.Durga.Part2.Sub1;

public class Outer2
{
    int x = 10;

    class Inner2
    {
        int x = 100;

        public void m1()
        {
            int x  = 1000;

            System.out.println("Local-variable of m1() : " + x);

            System.out.println("Instance-variable of Inner2-Class : " + this.x);

            System.out.println("Instance-varibale of Outer2-Class : " + Outer2.this.x);

            Outer2 o = new Outer2();
            System.out.println(o.x);
            System.out.println(Outer2.this.x);


        }
    }

    public static void main(String[] args) {

        new Outer2().new Inner2().m1();
    }
}
