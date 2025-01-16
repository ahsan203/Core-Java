package Practice.OOPS.Durga.Section4_DataHiding_Abstraction_EncapSulation.Overloading_Overrirding_MethodHiding;

//------ Overriding of static-methods is "Data-Hiding", and ot acts as "Static-Polymorphism" OR "Compile-time Polymorphism"
class Animals
{
    public static void sound()
    {
        System.out.println("Animal-Sound");
    }
}

class Monkeys extends Animals
{
    public static void sound()
    {
        System.out.println("Monkey-Sound");
    }
}
public class MethodHiding1
{
    public static void main(String[] args) {

        Animals animal = new Animals();
        animal.sound();

        Monkeys monkey = new Monkeys();
        monkey.sound();

        Animals am = new Monkeys();
        am.sound();
    }
}