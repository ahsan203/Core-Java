package Practice.DesignPatterns.Durgesh.Factory.Example2;

public class Vehicle
{
    public static void main(String[] args) {

        Tyres bridgeStone = VehicleFactory.getTyre("bridgeStone");
        System.out.println(bridgeStone.makeTyre());

        Tyres michelin = VehicleFactory.getTyre("michelIN  ");
        System.out.println(michelin.makeTyre());


        Speakers sony = VehicleFactory.getSpeakerCompany("SoNy");
        System.out.println(sony.sound());

        Speakers jbl = VehicleFactory.getSpeakerCompany("jbl");
        System.out.println(jbl.sound());
    }
}
