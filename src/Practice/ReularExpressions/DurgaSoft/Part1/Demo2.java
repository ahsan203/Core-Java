package Practice.ReularExpressions.DurgaSoft.Part1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2
{
    static String name = "Honey";
    static String result = "ey";
    public static void main(String[] args) {

        Pattern p = Pattern.compile(result);
        Matcher m = p.matcher(name);

        while(m.find())
        {
            System.out.println(m.start()+"-------"+(m.end()-1)+"------"+m.group());
        }

    }
}
