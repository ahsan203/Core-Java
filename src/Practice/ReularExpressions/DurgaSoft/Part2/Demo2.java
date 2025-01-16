package Practice.ReularExpressions.DurgaSoft.Part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2
{
    public static void main(String[] args) {

        Pattern p = Pattern.compile("a?");
        Matcher m = p.matcher("abaabaaab");

        while(m.find())
        {
            System.out.println(m.start()+"-------------"+m.group());
        }
    }
}
