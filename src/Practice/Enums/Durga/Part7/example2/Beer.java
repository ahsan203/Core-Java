package Practice.Enums.Durga.Part7.example2;

public enum Beer
{
    KF(100),KO(75),RC(90),FO;

    int price;

    Beer(int price)
    {
        this.price = price;
    }

    Beer()
    {
        System.out.println("Default-Constructor");
    }

    public int getPrice() {
        return price;
    }
}
