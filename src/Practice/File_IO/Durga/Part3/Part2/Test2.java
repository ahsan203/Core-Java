package Practice.File_IO.Durga.Part3.Part2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

public class Test2
{
    public static void main(String[] args) throws Exception{

        FileReader fr1 = new FileReader("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\File_IO\\Durga\\Part3\\ArrayList_Part2_Part3\\A.txt");
        BufferedReader br1 = new BufferedReader(fr1);

        String line = br1.readLine();
        while(line!=null)
        {
            System.out.println(line);
            line = br1.readLine();
        }

    }
}
