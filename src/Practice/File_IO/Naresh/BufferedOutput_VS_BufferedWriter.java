package Practice.File_IO.Naresh;

import java.io.*;

public class BufferedOutput_VS_BufferedWriter
{
    public static void main(String[] args) throws Exception {

        BufferedWriter bw1 = new BufferedWriter(new FileWriter("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\File_IO\\Naresh\\A.txt"));
        bw1.write("Name : Ahsan Shareef Mohammed.");
        bw1.newLine();
        bw1.write("Age : 28");
        bw1.newLine();
        bw1.write("City : Bloomingdale");
        bw1.flush();
        bw1.close();

        BufferedOutputStream bos1 = new BufferedOutputStream(new FileOutputStream("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\File_IO\\Naresh\\B.txt"));
       // String s1 = "Ahsan Shareef Mohammed";
        //byte b1 = Byte.parseByte(s1);
        byte b2 = 12;
        bos1.write(b2);
        bos1.flush();
        bos1.close();

        System.out.println("Program Executed Successfully.");

    }
}
