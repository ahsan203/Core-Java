package Practice.Java8.DurgaPractice2.Function;

import java.util.function.Function;

public class RemoveSpaces
{
    static String s = "Ahsan Shareef Mohammed";

    public static void main(String[] args) {

        //--- Function to remove spaces:
        Function<String, String> f1 = s -> s.replace(" ", "");

        System.out.println(f1.apply(s));

        //----- Function to count number of spaces in given String:
        Function<String, Integer> f2 = s ->
        {
            String str1 = s.replaceAll(" ", "");

            Integer numberOfSpaces = s.length() - str1.length();

            return numberOfSpaces;
        };

        System.out.println(f2.apply(s));
    }

}
