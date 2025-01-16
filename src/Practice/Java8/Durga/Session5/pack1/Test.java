package Practice.Java8.Durga.Session5.pack1;

public class Test implements  Left,Right
{
    @Override
    public void m1() {
        Left.super.m1();
        Right.super.m1();
    }


    public static void main(String[] args) {

        Test t1 = new Test();
        t1.m1();
    }
}
