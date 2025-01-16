package Practice.DesignPatterns.Durgesh.Factory.Example1;

import Practice.DesignPatterns.Durgesh.Factory.Example1.Employee;

public class WebDeveloper implements Employee
{
    public int salary()
    {
        System.out.println("Getting salary of Web-Developer");

        return 250000;
    }
}
