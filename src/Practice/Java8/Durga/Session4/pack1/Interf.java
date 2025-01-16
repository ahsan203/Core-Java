package Practice.Java8.Durga.Session4.pack1;

public interface Interf
{
    public void m1();
}

class Anonymous_Inner_Class
{
    int x = 888;

    public void m2()
    {
        Interf i = new Interf()
        {
            int x = 999;
            @Override
            public void m1() {
                System.out.println("Test.this.x : " + Anonymous_Inner_Class.this.x);
                System.out.println("this.x : " + this.x);
            }
        };
        Interf i2 = new Interf()
        {
            int x = 999;
            @Override
            public void m1() {
                System.out.println("Test.this.x : " + Anonymous_Inner_Class.this.x);
                System.out.println("this.x : " + this.x);
            }
        };
        i.m1();
        i2.m1();
    }

    public void m3()
    {
        //--------- Lambda-Expression : -------------

        Interf i = () -> {
            int x1=555;
            System.out.println("this.x  : " +this.x);
            System.out.println("x1 : " + x1);
        };
        i.m1();

    }


    public static void main(String[] args) {

        Anonymous_Inner_Class t = new Anonymous_Inner_Class();
        System.out.println("------------Anonymous Inner Class ------------------------------------");
        t.m2();
        System.out.println("-------------------Lambda Expression : ------------------------------");
        t.m3();

        System.out.println("--------------------Lambda Expression-2 : ----------------");
        Interf i = () -> {
            int x1=555;
            System.out.println("this.x  : " + new Anonymous_Inner_Class().x);
            System.out.println("x1 : " + x1);
        };
        i.m1();
    }
}