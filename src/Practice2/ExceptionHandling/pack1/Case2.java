package Practice2.ExceptionHandling.pack1;

import java.io.FileNotFoundException;

public class Case2
{
    public static void main(String[] args) {
        try {
            throw new FileNotFoundException("File not found");
        }
        catch (FileNotFoundException f)
        {
            f.printStackTrace();
        }
    }
}
