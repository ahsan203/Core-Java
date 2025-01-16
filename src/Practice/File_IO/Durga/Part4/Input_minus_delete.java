package Practice.File_IO.Durga.Part4;

import javax.imageio.event.IIOWriteProgressListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Input_minus_delete
{
    public static void main(String[] args) throws IOException {

        //--- output.txt = input.txt-delete.txt

        PrintWriter pw1 = new PrintWriter("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\File_IO\\Durga\\Part4\\output.txt");

        BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\File_IO\\Durga\\Part4\\input.txt"));
        String line1 = br1.readLine();

        BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\File_IO\\Durga\\Part4\\delete.txt"));
        String line2 = br1.readLine();

        while((line1!=null) || (line2!=null))
        {
            if(line1!=null || line2!=null)
            {
                if(!line1.contains(line2))
                {
                    pw1.println(line1);
                    line1 = br1.readLine();
                    line2 = br2.readLine();
                }
            }

        }



    }
}
