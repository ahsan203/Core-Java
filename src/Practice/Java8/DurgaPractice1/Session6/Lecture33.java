package Practice.Java8.DurgaPractice1.Session6;

import java.util.Scanner;
import java.util.function.Predicate;

class User
{
     String userName;
    String password;

    User(String userName, String password)
    {
        this.userName = userName;
        this.password = password;
    }

}
public class Lecture33
{
    public static void main(String[] args) {

        Predicate<User> p1 = user->user.userName.equals("Ahsan") && user.password.equals("Eno123");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Username : ");
        String username = scanner.next();
        System.out.println("Password :");
        String password = scanner.next();

        User ahsan = new User(username,password);

        if(p1.test(ahsan))
        {
            System.out.println("You have successfully logged-in.");
        }
        else
        {
            System.out.println("Please check username or password!");
        }



    }
}
