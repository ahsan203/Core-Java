package Practice.File_IO.Durga.Part1;

import java.io.File;
import java.io.IOException;

public class Example3
{
    public static void main(String[] args) throws IOException {

    //------- Using f.length() below -------------

        File f1 = new File("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\File_IO\\Part1\\Z1.txt");
        f1.createNewFile();
        System.out.println(f1.exists());
        long result1 = f1.length();
        System.out.println("Number of characters in Z1.txt : " + result1);

    //-------- Using f.list() below ----------------------

        File f2 = new File ("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\File_IO\\Part1");
        String [] s1 = f2.list();

        int count = 0;
        for(String s : s1)
        {
            System.out.println(s);
            count ++;
        }
        System.out.println("Number of \"File\\Folder\" : " + count);
    }
}
