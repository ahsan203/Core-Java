package Practice.File_IO.Durga.Part1;

import java.io.File;

public class ToDisplayOnlyFileNames
{
    public static void main(String[] args) {

        File f2 = new File ("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\File_IO\\Part1");
        String [] s1 = f2.list();

        int count = 0;
        for(String s : s1)
        {
            File f10 = new File(f2,s);

            if(f10.isFile())
            {
                System.out.println(s);
            }

            count ++;
        }
        System.out.println("Number of only \"Files\" : " + count);
    }
}
