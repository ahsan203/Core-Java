package Expressions_Statements;

public class Coding_Exercise_2_Speed_Converter
{
    public static void main(String[] args)
    {
        System.out.println(toMilesPerHour(1.5));

       printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour)
    {
        if(kilometersPerHour<0)
        {
            return -1;
        }

        else
        {
            double milesPerHour = (kilometersPerHour/1.609) ;

            return Math.round(milesPerHour);
        }
    }

    public static void printConversion(double kilometersPerHour)
    {
            // 1 milePerHour = 1.609 kilometersPerHour

        if(kilometersPerHour<0)
        {
            System.out.println("Invalid value");
        }
        else
        {
            long result =  toMilesPerHour(kilometersPerHour);

            System.out.println(kilometersPerHour +" km/h = "+result+" mi/h");
        }
    }
}
