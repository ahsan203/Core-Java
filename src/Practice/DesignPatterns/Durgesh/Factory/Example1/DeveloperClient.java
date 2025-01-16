package Practice.DesignPatterns.Durgesh.Factory.Example1;

public class DeveloperClient
{
    public static void main(String[] args) {

       Employee web_developer =  EmployeeFactory.getEmployee("Web Developer");
        System.out.println(web_developer);
        System.out.println(web_developer.salary());

        System.out.println("------------------------------------------");

        Employee android_developer = EmployeeFactory.getEmployee("Android Developer   ");
        System.out.println(android_developer);
        System.out.println(android_developer.salary());
    }
}
