package Practice.MultiThreading.Durga.Part7.example_2;

public class MainCredit
{
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount();
        User husband = new User(sa,500);
        husband.start();

        User wife = new User(sa,300);
        wife.start();
    }
}
