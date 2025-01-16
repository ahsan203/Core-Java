package Practice.Enums.Durga.Part7.example1;

public enum Beer
{
    KF,KO,RC,FO;

    Beer()
    {
        System.out.println("Constructor...");
    }
}

class Test{

    public static void main(String[] args) {

        Beer b1 = Beer.KF;

        System.out.println("Hello");
    }
}
