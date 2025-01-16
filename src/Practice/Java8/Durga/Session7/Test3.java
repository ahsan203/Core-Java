package Practice.Java8.Durga.Session7;

import java.util.function.Function;

public class Test3
{
    public static void main(String[] args) {

        System.out.println(" \" Program to count number of spaces present in given string : \" ");

        Function<String,Integer> f1 = s1 -> {
            int count=0;
            for(int i=0; i<s1.length(); i++) {
                if(s1.charAt(i) == ' ')
                    count++;
            }
            return count;
        };
        String str = "Ahsan Shareef Mohammed";
        System.out.println(str);
        System.out.println("Number of Spaces : " +f1.apply(str));

        System.out.println("---------------------------------------------");

        String str2 = "Durga  Software  Solutions  Hyderbad ";
        System.out.println(str2);
        System.out.println("Number of spaces : " + f1.apply(str2));

       /* int count=0;
        for(int i=0; i<s1.length(); i++) {
            if(s1.charAt(i) == ' ')
            count++;
        }
        System.out.println("Number of spaces: " + count);*/

    }
}
