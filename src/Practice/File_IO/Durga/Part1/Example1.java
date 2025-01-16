package Practice.File_IO.Durga.Part1;

import java.io.File;
import java.io.IOException;

public class Example1
{

    public static void main(String[] args) throws IOException {

        File f1 = new File("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\File_IO\\Part1\\file1.txt");
        f1.createNewFile();

        System.out.println(f1.exists());

        File f2 = new File("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\File_IO\\Part1\\Folder1");
        f2.mkdir();

        System.out.println(f2.exists());

    }
}
