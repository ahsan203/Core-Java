package Practice.Java8.DurgaPractice1.Session2;

public class Test
{
    public static void main(String[] args) {


        Interf1 lamb1 = ()-> System.out.println("Interf1 : m1 method implementation.");
        lamb1.m1();


        Interf2 lamb2 = (a,b)-> System.out.println(a+b);
        System.out.print("Interf2 : add method implementation : ");
        lamb2.add(5,5);

        Interf3 lamb3 = s-> s.length();
        System.out.println("Interf3 : " + lamb3.getLength("Ahsan"));

        Interf4 lamb4 = num1 -> num1*num1;
        System.out.println("Interf4 : " + lamb4.squareIt(10));


        Runnable lamb5 = ()->
        {
            for(int i=0; i<10; i++)
            {
                System.out.println("Child-Thread");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(lamb5);
        t1.start();

         for(int i=0; i<10; i++)
         {
            System.out.println("MainCredit-Thread");

            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ie)
            {
                ie.printStackTrace();
            }
        }
    }
}
