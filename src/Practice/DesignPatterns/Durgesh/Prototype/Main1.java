package Practice.DesignPatterns.Durgesh.Prototype;

public class Main1
{
    public static void main(String[] args) throws InterruptedException {

        Juice tropicana1 = new Juice("Oranage-LowAcid",3);
        Thread.sleep(8000);
        System.out.println("tropicana-1 : "+ tropicana1);
        System.out.println("tropicana1-hashCode : "+tropicana1.hashCode());


        System.out.println("-------------------------------------------------------------------------");

        //---- We are cloning tropicana-1 to create tropicana-2, By using Prototype-Design-Pattern :

        try {
            Juice tropicana2 = (Juice) tropicana1.clone();
            System.out.println("tropicana-2 : " + tropicana2);
            System.out.println("tropicana2-hashCode : "+tropicana2.hashCode());
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        }
}
