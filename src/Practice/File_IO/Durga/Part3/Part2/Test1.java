package Practice.File_IO.Durga.Part3.Part2;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Test1
{
    public static void main(String[] args) throws Exception{

        FileWriter fw1 = new FileWriter("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\File_IO\\Durga\\Part3\\ArrayList_Part2_Part3\\A.txt");
        BufferedWriter bw1 = new BufferedWriter(fw1);

        bw1.write("Name :Ahsan Shareef\n" +
                        "Age : 28\n"+
                        "city : Bloomingdale.");

        bw1.newLine();
        bw1.newLine();
        bw1.newLine();


        bw1.write("Name :Shoeab Ansari\n" +
                "Age : 28\n"+
                "city : Hyderabad.\n");
        bw1.flush();
        bw1.close();
    }
}
