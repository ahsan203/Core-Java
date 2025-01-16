package Practice.Enums.Durga.Part5;

import java.util.Arrays;

public class Test1
{
    public static void main(String[] args) {

        Coffee[] coffeeList = Coffee.values();

            for(int i=0; i< coffeeList.length; i++)
            {
                System.out.println(coffeeList[i]);
            }

        System.out.println("----------------------");

            for(Coffee c1 : coffeeList)
            {
                System.out.println(c1);
            }

        System.out.println("-----------Ordinal()-----------------");

        for(Coffee c1 : coffeeList)
        {
            System.out.println(c1 + " = " + c1.ordinal());
        }
    }
}
