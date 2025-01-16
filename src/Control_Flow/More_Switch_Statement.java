package Control_Flow;

public class More_Switch_Statement
{
    public static void main(String[] args)
    {
        //-------- Enhanced Switch Statement ----------------

        String sales = getQuarter("august");
        System.out.println(sales);

      /*  String country_location = location("ismail");
        System.out.println(country_location);*/
    }

    public static String getQuarter(String month)
    {
        switch(month)
        {
            case "january" : case "february": case "march" : {
                return "First Quarter sales is 40%";

            }
            case "april": case "may": case"june" :
                    {
                         return "First Quarter sales is 40%";
                    }
            case "july": case "august": case "september" :
                    {
                       return "Third Quarter sales is 15%";

                    }
            case "october": case "november": case "december":
                    {
                        return "Fourth Quarter sale is 20%";
                    }
            default:
                    {
                        System.out.println("Invalid month! Please enter valid month.");
                        return "Invalid month! Please enter valid month.";
                    }


        }

    }

    /*public static String location(String country)
    {
        return switch(country)
        {
            case  "nomaan","shoeab","zaki","muzammil" ->
                    {
                        yield "India";
                    }
            case "ahsan" ->
                    {
                        yield "USA";
                    }
            case "isamil", "hisham" -> {
                yield "Saudi Arabia";
            }
            default ->
                    {
                        yield " Please enter a valid name";
                    }
        };
    }*/
}
