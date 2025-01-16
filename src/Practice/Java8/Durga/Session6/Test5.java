package Practice.Java8.Durga.Session6;

import java.util.Scanner;
import java.util.function.Predicate;

class User
{
    String name;
    String password;

    public User(String name, String password)
    {
        this.name=name;
        this.password=password;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

public class Test5
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = scan.nextLine();
        //scan.nextLine();
        System.out.println("Enter you password :");
        String password = scan.nextLine();

        User ahsan = new User(name,password);

        Predicate<User> p1 = u1 -> (u1.getName()).equals("ahsan203") && (u1.getPassword()).equals("qwerty");
        System.out.println(p1.test(ahsan));

        if(p1.test(ahsan))
        {
            System.out.println("You have successfully logged in...");
        }
        else
        {
            System.out.println("Invalid credentials, Please log-in again");
        }


    }
}
