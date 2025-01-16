package Practice.RuntimePolymorphism.Personal;

public class Test
{
    public static void main(String[] args) {

        A a1 =new A(); a1.m1();

        B b1 = new B(); b1.m1();

        A a2 = new B(); a2.m1();
    }
}
