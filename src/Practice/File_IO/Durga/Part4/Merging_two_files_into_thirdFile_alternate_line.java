package Practice.File_IO.Durga.Part4;

import java.io.*;

public class Merging_two_files_into_thirdFile_alternate_line
{
    public static void main(String[] args) throws IOException {

        BufferedWriter bw1 = new BufferedWriter(new FileWriter("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\File_IO\\Durga\\Part4\\file4.txt",true));
        PrintWriter pw1 = new PrintWriter(bw1);
        pw1.println("-----------------------");

        BufferedReader br1 = new BufferedReader(new
                FileReader("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\File_IO\\Durga\\Part4\\file1.txt"));
        String line1 = br1.readLine();

        BufferedReader br2 = new BufferedReader(new
                FileReader("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\File_IO\\Durga\\Part4\\file2.txt"));
        String line2 = br2.readLine();

        while(line2!=null || line2!=null)
        {
            if(line1!=null)
            {
                System.out.println(line1);
                pw1.println(line1);
                line1 = br1.readLine();
            }

            if(line2!=null)
            {
                System.out.println(line2);
                pw1.println(line2);
                line2=br2.readLine();
            }

        }


        br1.close();
        br2.close();
        pw1.flush();
        pw1.close();

    }
}
