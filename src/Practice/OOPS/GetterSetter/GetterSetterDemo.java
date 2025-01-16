package Practice.OOPS.GetterSetter;

public class GetterSetterDemo
{
    private int roll;
    private String schoolName;

    public GetterSetterDemo(int roll, String schoolName) {
        this.roll = roll;
        this.schoolName = schoolName;
    }

    public int getRoll()
    {
        return roll;
    }

    public void setRoll(int roll)
    {
        if(roll<0 || roll>30)
        {
            System.out.println("Please enter rollNo between 1-30.");
            throw new IllegalArgumentException();

        }
        else
        {
            this.roll=roll;
        }

    }
}
