package Practice.OOPS.Durga.Section4_DataHiding_Abstraction_EncapSulation.Overloading_Overrirding_MethodHiding;

class Animal
{
    public void sound()
    {
        System.out.println("Animal-Sound");
    }
}

class Monkey extends Animal
{
    public void sound()
    {
        System.out.println("Monkey-Sound");
    }
}
public class Overriding1
{
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.sound();

        Monkey monkey = new Monkey();
        monkey.sound();

        Animal am = new Monkey();
        am.sound();
    }
}
