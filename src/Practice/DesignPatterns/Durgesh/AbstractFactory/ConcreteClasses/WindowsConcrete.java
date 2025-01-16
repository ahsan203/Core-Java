package Practice.DesignPatterns.Durgesh.AbstractFactory.ConcreteClasses;

import Practice.DesignPatterns.Durgesh.AbstractFactory.abstractFactory.UIFactory;
import Practice.DesignPatterns.Durgesh.AbstractFactory.windows.WindowsButton;
import Practice.DesignPatterns.Durgesh.AbstractFactory.windows.WindowsCheckbox;

public class WindowsConcrete implements UIFactory
{
    public WindowsButton createButton()
    {
        return new WindowsButton();
    }

    public WindowsCheckbox createCheckBox()
    {
        return  new WindowsCheckbox();
    }
}
