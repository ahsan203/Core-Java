package Practice.File_IO.Naresh;

import java.io.FileInputStream;
import java.io.IOException;

public class Copy_Image
{
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("C:\\Users\\farna\\Desktop\\Ahsan_Images\\Ahsan Shareef pic.jpg");
        int i1 = fis.read();
        System.out.println(i1);
    }
}
