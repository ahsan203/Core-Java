package Practice2.ExceptionHandling.UserdefineExceptions;

public class Election
{
    public static void main(String[] args) {

        int age = 20;

        if(age<18)
        {
            throw new Minor("Age is not eligible to vote");
        }
        else if(age>18)
        {
            throw new Major("You can vote");
        }
    }
}
