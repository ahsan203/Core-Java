package Practice.File_IO.Naresh;

import java.io.File;
import java.io.IOException;

public class Making_Folders
{
    public static void main(String[] args) {

            File f1 = new File("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\File_IO\\Naresh\\folder1");
            f1.mkdir();

            File f2 = new File("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\File_IO\\Naresh\\folder2");
            f2.mkdir();

    }
}
