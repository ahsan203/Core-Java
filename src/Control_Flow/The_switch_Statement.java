package Control_Flow;

public class The_switch_Statement
{
    public static void main(String[] args)
    {
        String name="ireland";

        switch(name)
        {
            case "usa" :
                System.out.println("Joe Biden is a President of, United States of America.");
                break;

            case "russia" :
                System.out.println("Vladamir Putin is Russia's President. ");
                break;

            case "canada":
                System.out.println("Justin Turdeau is Canada's Prime Minister.");
                break;

            case "uk" : case "scotland" : case "ireland" :
                System.out.println("King Charles.");
                break;

            default :
                System.out.println("No President is matching from list.");
                break;
        }

    }
}
