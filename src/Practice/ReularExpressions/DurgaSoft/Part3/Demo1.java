package Practice.ReularExpressions.DurgaSoft.Part3;

import java.util.regex.Pattern;

public class Demo1
{
    public static void main(String[] args) {

        Pattern  p  = Pattern.compile("\\s");
       String[] name =  p.split("Ahsan Shareef Mohammed");

       for(String s1 : name)
       {
           System.out.println(s1);
       }
    }
}
