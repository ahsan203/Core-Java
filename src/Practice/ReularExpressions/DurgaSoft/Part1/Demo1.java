package Practice.ReularExpressions.DurgaSoft.Part1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1
{
    public static void main(String[] args) {

       Pattern p = Pattern.compile("ab");
      Matcher m = p.matcher("ababbaba");

      int count=0;
      while(m.find())
      {
          System.out.println(m.start()+"----------"+(m.end()-1)+"--------"+m.group());
          count++;
      }
        System.out.println("Total number of occurences = "+count);

    }

}
