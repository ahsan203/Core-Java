package Practice.DesignPatterns.Durgesh.AbstractFactory.ConcreteClasses;

import Practice.DesignPatterns.Durgesh.AbstractFactory.Mac.MacButton;
import Practice.DesignPatterns.Durgesh.AbstractFactory.Mac.MacCheckBox;
import Practice.DesignPatterns.Durgesh.AbstractFactory.abstractFactory.UIFactory;

public class MacConcrete implements UIFactory
{
    @Override
    public MacButton createButton() {
        return new MacButton();
    }

    public MacCheckBox createCheckBox()
    {
        return new MacCheckBox();
    }
}
