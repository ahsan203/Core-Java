package Practice.File_IO.Durga.Part2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OverWrite
{
    public static void main(String[] args) throws IOException {

        FileWriter fw1 = new FileWriter("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\File_IO\\ArrayList_Part2_Part3\\A1.txt");
        fw1.write("Name : Shoeab Ansari." +
                "      Roll : 7018");
        fw1.flush();

        File f1 = new File("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\File_IO\\ArrayList_Part2_Part3\\A2.txt");
        FileWriter fw2 = new FileWriter(f1);
        char[] ch = {'a','b','c'};
        fw2.write(ch);
        fw2.flush();


        File f2 = new File("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\File_IO\\ArrayList_Part2_Part3\\A4.txt");
        f2.createNewFile();
        FileWriter fw3 = new FileWriter(f2);
        fw3.write("Name : Ahsan Shareef Mohammed\n" +
                "Age : 28");
        fw3.flush();




    }
}
