package Practice.File_IO.Telusko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input_Using_BufferedReader
{
    public static void main(String[] args) throws IOException {

       // InputStreamReader ip = new InputStreamReader(System.in);
        //BufferedReader br1 = new BufferedReader(ip);

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name : ");
        String name = br1.readLine();

        System.out.println("Enter your age : ");
        int age = Integer.parseInt(br1.readLine());

        System.out.println("Enter your city : ");
        String city = br1.readLine();

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("City : " + city);
    }
}
