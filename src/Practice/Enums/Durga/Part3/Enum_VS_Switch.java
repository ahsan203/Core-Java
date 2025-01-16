package Practice.Enums.Durga.Part3;


enum Beer {
    KF,KO,RC,FO;
}

public class Enum_VS_Switch
{
    public static void main(String[] args) {
        Beer obj1;
        obj1=Beer.KF;

        switch (obj1)
        {
            case KF :
                System.out.println("It is children's brand");
                break;
            case KO :
                System.out.println("It is too light");
                break;
            case RC :
                System.out.println("It is not that much");
                break;
            case FO :
                System.out.println("Buy one get one free");
                break;
            default:
                System.out.println("Beer is not allowed to drink in Islam, which is very good teaching");
        }
    }

}
