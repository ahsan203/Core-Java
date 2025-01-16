package Practice.DesignPatterns.Durgesh.Singleton;

public class Test2
{
    float num1 = 0.1f + 0.7f;
    float num2 = 0.8f;

    public static void main(String[] args) {

        Test2 obj1 = new Test2();
        System.out.println(obj1.num1== obj1.num2);
    }
}
