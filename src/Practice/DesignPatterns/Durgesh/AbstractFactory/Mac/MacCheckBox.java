package Practice.DesignPatterns.Durgesh.AbstractFactory.Mac;

import Practice.DesignPatterns.Durgesh.AbstractFactory.abstractInterfaces.CheckBox;

public class MacCheckBox implements CheckBox
{
    @Override
    public void paint() {
        System.out.println("Mac CheckBox");
    }
}
