package Practice.MultiThreading.Durga.Part2;

public class Example3
{
    public static void main(String[] args)
    {
            Example3 ex3 = new Example3();
            ex3.main();
            ex3.main("Ahsan Shareef Mohammed");
    }
    public static void main()
    {
        System.out.println("no-arg main()");
    }

    public static void main(String name)
    {
        System.out.println("Name : "+name);
    }
}
