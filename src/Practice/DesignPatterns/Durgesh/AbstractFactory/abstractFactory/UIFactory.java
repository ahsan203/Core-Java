package Practice.DesignPatterns.Durgesh.AbstractFactory.abstractFactory;

import Practice.DesignPatterns.Durgesh.AbstractFactory.abstractInterfaces.Button;
import Practice.DesignPatterns.Durgesh.AbstractFactory.abstractInterfaces.CheckBox;


//-------- Abstract Factory
public interface UIFactory
{
    Button createButton();

    CheckBox createCheckBox();
}
