package Practice.File_IO.Naresh;

import java.io.*;

public class Copying_txtFiles
{
    public static void main(String[] args) {
        try
        {
            BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\File_IO\\Naresh\\A.txt"));
            String line =  br1.readLine();

            //--- Now copying above file and writing(pasting) in new File....

            BufferedWriter bw1 = new BufferedWriter(new FileWriter("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\File_IO\\Naresh\\copyText.txt"));

            while(line!=null)
            {
                System.out.println(line);
                bw1.write(line);
                bw1.newLine();
                line = br1.readLine();
            }

            bw1.flush();
            bw1.close();

            System.out.println("Program Executed Successfully.");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
