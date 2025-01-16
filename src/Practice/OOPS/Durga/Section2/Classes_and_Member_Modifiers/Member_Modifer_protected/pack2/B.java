package Practice.OOPS.Durga.Section2.Classes_and_Member_Modifiers.Member_Modifer_protected.pack2;

import Practice.OOPS.Durga.Section2.Classes_and_Member_Modifiers.Member_Modifer_protected.pack1.A;

public class B extends A
{
    public static void main(String[] args) {

        A a1 = new A();
       // a1.m1();

        B b1 = new B();
        b1.m1();

        A a2 = new B();
        //a2.m1();
    }
}
