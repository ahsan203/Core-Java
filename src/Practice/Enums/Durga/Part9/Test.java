package Practice.Enums.Durga.Part9;

public class Test
{
    public static void main(String[] args) {

        Color[] colors1 = Color.values();

        for(Color c1 : colors1)
        {
            c1.info();
        }
    }
}
