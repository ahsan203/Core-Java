package Practice.File_IO.Durga.Part3.Part1;

import java.io.FileReader;
import java.io.IOException;

public class Test1
{
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\File_IO\\Part3\\Part1\\A1.txt");
      //  int i = fr.read();
       // System.out.println((char)i);



        int i2 = fr.read();

        while(i2!=-1)
        {
            System.out.print((char)i2);
            i2=fr.read();
        }

        System.out.println("----------------------------------");

    }
}
