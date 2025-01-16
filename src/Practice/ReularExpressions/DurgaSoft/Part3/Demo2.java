package Practice.ReularExpressions.DurgaSoft.Part3;

import java.util.regex.Pattern;

public class Demo2
{
    public static void main(String[] args) {

        Pattern p  = Pattern.compile("\\.");
        String[] name =  p.split("www.google.com");

        for(String s1 : name)
        {
            System.out.println(s1);
        }
    }
}
