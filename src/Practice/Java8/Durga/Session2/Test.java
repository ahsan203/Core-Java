package Practice.Java8.Durga.Session2;

public class Test
{
    public static void main(String[] args) {



        Interf1 lamb1 = ()-> System.out.println("This is m1() method, which is called by using Lambda Expression.");
        lamb1.m1();



        Interf2 lamb2 = (a,b)-> System.out.println("Sum of " + a +" and " + b + " is = " + (a+b));
        lamb2.add(5,3);




        Interf3 lamb3 = s->  s.length();
        int len = lamb3.getLength("Zaid");
        System.out.println("Length : " + len);





        Interf4 lamb4 = (num)->
        {
            for(int i=1; i<=10; i++)
            {
                System.out.println(num + " * " + i + " = " + (num*i));
            }
        };
        lamb4.multiplyTable(2);







        Runnable z = ()->
        {
            for(int i=0; i<=10; i++)
            {
                System.out.println(i + "->Child Thread under MainCredit-Thread.");
                try
                {
                    Thread.sleep(500);
                }
                catch (InterruptedException ie)
                {
                    ie.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(z);
        t1.start();








    //------------- MainCredit-thread--------------
        for(int i=0; i<=10; i++)
        {
            System.out.println(i + "->MainCredit-Thread.");
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
    }
}
