package Practice.Enums.Durga.Part6;

public enum Fishes
{
    STAR, GUPPY, GOLD;

    public static void main(String[] args) {

        System.out.println("Enum-main() methods.....");

        Fishes[] fishes1 = Fishes.values();

        for(Fishes f : fishes1)
        {
            System.out.println(f + " = " + f.ordinal());
        }
    }
}
