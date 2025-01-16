package Practice.ExceptionHandling.Durga.Checked_Unchecked.Part1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedExceptionExample
{
    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter pw = new PrintWriter("abc.txt");
        pw.println("Hello");
    }
}
