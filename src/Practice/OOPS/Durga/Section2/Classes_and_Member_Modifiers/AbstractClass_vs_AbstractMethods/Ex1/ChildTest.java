package Practice.OOPS.Durga.Section2.Classes_and_Member_Modifiers.AbstractClass_vs_AbstractMethods.Ex1;

public class ChildTest extends Test
{
    public void m1()
    {
        System.out.println("child-test m1()");
    }

    public void m2()
    {
        System.out.println("child-test m2()");
    }

    public static void main(String[] args) {

        ChildTest ct = new ChildTest();
        ct.m1();
        ct.m2();
        ChildTest.m3();
    }
}
