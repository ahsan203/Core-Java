package Practice.DesignPatterns.Durgesh.AbstractFactory;

import Practice.DesignPatterns.Durgesh.AbstractFactory.ConcreteClasses.WindowsConcrete;
import Practice.DesignPatterns.Durgesh.AbstractFactory.abstractFactory.UIFactory;
import Practice.DesignPatterns.Durgesh.AbstractFactory.windows.WindowsButton;
import Practice.DesignPatterns.Durgesh.AbstractFactory.windows.WindowsCheckbox;

public class Client
{
    public static void main(String[] args) {
        UIFactory factory = new WindowsConcrete();

        WindowsButton windowsButton = (WindowsButton) factory.createButton();
        windowsButton.paint();

       WindowsCheckbox windowsCheckbox = (WindowsCheckbox) factory.createCheckBox();
       windowsCheckbox.paint();
    }
}
