package Practice.Java8.Durgesh.Lambda.pack1;

public class Main
{
    public static void main(String[] args) {

        System.out.println("My system starts...");

//--- 1) Runnable Interface :

        Runnable r1 = ()-> System.out.println("run method");
        r1.run();

//--- 2) MyInter Interface :

        MyInter myInter = ()-> System.out.println("Hello World!");
        myInter.sayHello();

//--- 3) SumInter Interface :

        SumInter sum1 = (int a, int b)->
        {
            return a+b;
        };
        int SumResult = sum1.Sum(12,3);
        System.out.println(SumResult);

//--- 4) StringLength Interface :

        StringLength s1 = (String str) ->  str.length();

        int length = s1.getLength("ZAID");
        System.out.println(length);

    }
}
