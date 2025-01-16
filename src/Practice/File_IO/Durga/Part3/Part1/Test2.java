package Practice.File_IO.Durga.Part3.Part1;

import java.io.File;
import java.io.FileReader;

public class Test2
{

    public static void main(String[] args) throws Exception{

//-- First-Step : find the length of file...
        File f = new File("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\File_IO\\Part3\\Part1\\A1.txt");
        long l = f.length();
        System.out.println("Length of the file \"A1.txt\" : " + l);


//--Second-Step : Now from above result fix the length of char[] :
        char[] ch1 = new char[29];
        FileReader fr = new FileReader(f);
        fr.read(ch1);
        for(char ch2 : ch1)
        {
            System.out.print(ch2);
        }

    }
}
