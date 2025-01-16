package Practice.Enums.Durga.Part9;

public enum Color
{
    BLUE,
    RED{ public void info() {
    System.out.println("Dangerous Color");
} },
    GREEN;

    public void info()
    {
        System.out.println("Universal Color");
    }
}
