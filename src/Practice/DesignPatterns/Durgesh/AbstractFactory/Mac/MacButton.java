package Practice.DesignPatterns.Durgesh.AbstractFactory.Mac;

import Practice.DesignPatterns.Durgesh.AbstractFactory.abstractInterfaces.Button;

public class MacButton implements Button
{
    @Override
    public void paint() {
        System.out.println("Mac Button");
    }
}
