package Practice.File_IO.Durga.Part1;

import java.io.File;
import java.io.IOException;

public class Example2
{

    public static void main(String[] args) throws IOException {

    //------- 1St-Constructor : -----------------------
        File f1 = new File("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\File_IO\\Part1\\A1.txt");
        f1.createNewFile();
        System.out.println(f1.exists());

    //------ 2nd-Constructor ----------------------------------
        File f2 = new File("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\File_IO\\Part1\\ABC","A2.txt");
        f2.createNewFile();
        System.out.println(f2.exists());

    //----- 3rd-Constructor -------------------------------------
        File f3 = new File("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\File_IO\\Part1\\Folder2");
        f3.mkdir();
        System.out.println(f3.exists());
        File f4 = new File(f3,"A3.txt");
        f4.createNewFile();
        System.out.println(f4.exists());

    }
}
