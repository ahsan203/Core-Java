package Practice.Enums.Durga.Part7.example2;

public class Test
{
    public static void main(String[] args) {

        Beer[] beer1 = Beer.values();

        for(Beer b : beer1)
        {
            System.out.println(b + " = " + b.getPrice());
        }

        Beer fo = Beer.FO;

    }
}
