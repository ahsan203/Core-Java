package Practice.File_IO.Durga.Part2;

import java.io.FileWriter;
import java.io.IOException;

public class Appends
{
    public static void main(String[] args) throws IOException {

        FileWriter fw1 = new FileWriter("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\File_IO\\ArrayList_Part2_Part3\\A3.txt",true);
        fw1.write("----------------------------------\n");
        fw1.write("\n" +  "Name : Nomaan.\n" +
                "Roll : 7040\n" + "Gender : Male\n");
        fw1.write("----------------------------------\n");

        fw1.flush();
    }

}
