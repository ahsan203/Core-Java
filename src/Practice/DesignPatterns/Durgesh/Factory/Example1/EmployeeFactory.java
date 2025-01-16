package Practice.DesignPatterns.Durgesh.Factory.Example1;

public class EmployeeFactory
{
    public static Employee getEmployee(String employee_Category)
    {
        if(employee_Category.trim().equalsIgnoreCase("Android Developer"))
        {
            return new AndroidDeveloper();
        }
        else if(employee_Category.trim().equalsIgnoreCase("Web Developer"))
        {
            return new WebDeveloper();
        }
        else
        {
            return null;
        }
    }
}
