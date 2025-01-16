package IntelliJBasics.TerneryOperator;

public class One
{
    public static void main(String[] args)
    {
        String makeOfCar = "Ford";
        boolean isDomestic = makeOfCar == "Ford" ? true : false;

        System.out.println("isDomestic : " + isDomestic);

        if(isDomestic)
        {
            System.out.println("This car is Domestic to our Country");
        }
    }
}
