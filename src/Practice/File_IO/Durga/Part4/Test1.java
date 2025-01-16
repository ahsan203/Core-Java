package Practice.File_IO.Durga.Part4;

import Arrays.ScannerExample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test1
{
    public static void main(String[] args) throws IOException {

        BufferedWriter bw1 = new BufferedWriter(new FileWriter
                ("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\File_IO\\Durga\\Part4\\ahsan.txt",true));
        PrintWriter pw1 = new PrintWriter(bw1);
        pw1.println("-----------------------------------------");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = scan.nextLine();
        pw1.println("Name : " + name);

        System.out.println("Enter your Age : ");
        int age = scan.nextInt();
        pw1.println("Age : " + age);

        scan.nextLine();
        System.out.println("Enter city : ");
        String city = scan.nextLine();
        pw1.println("City : " + city);

        pw1.println("int value : "+12);
        pw1.println("double value : " + 23.4);
        pw1.println("float value : " + 12.3);

        pw1.flush();
        pw1.close();
    }
}
