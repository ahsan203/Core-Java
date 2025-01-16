package Practice.ReularExpressions.DurgaSoft.Part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1
{
    public static void main(String[] args) {

        Pattern p = Pattern.compile("\\w");
        Matcher m = p.matcher("a7b k@9z");

        while(m.find())
        {
            System.out.println(m.start()+"---------------"+ m.group());
        }







    }
}
