package Arrays;

import Practice.InnerClasses.Durga.Part2.Sub1.A;

import java.util.Arrays;

public class Part1
{
    public static void main(String[] args) {

        int [] shrimnz = new int [7];
        shrimnz[0] = 7018;
        shrimnz[1] = 7022;
        shrimnz[2] = 7035;
        shrimnz[3] = 7099;
        shrimnz[4] = 7098;
        shrimnz[5] = 7040;
        shrimnz[6] = 7027;
        System.out.println("Without using Arrays.toString() : " +shrimnz);
        System.out.println("Using Arrays.toString() : " + Arrays.toString(shrimnz));

        for(int s : shrimnz)
        {
            System.out.print(s + ", ");
        }
        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println("Length of SHRIMNZ : " + shrimnz.length);


        String[] names = {"Ahsan", "Shoeab", "Zaki","Nomaan"};
        System.out.println("Arrays.toString() : " + Arrays.toString(names));

        for(int i = 0; i<names.length; i++)
        {
            System.out.print(names[i] + ", ");
        }
        System.out.println();
        for(String s2 :names)
        {
            System.out.print(s2 + ", ");
        }


        System.out.println();
        System.out.println("--------------------");
        String[] friends = new String[3];
        friends[0] = "Ahsan";
        friends[1] = "Shoeab";
        friends[2] = "Zaki";

        System.out.println("Arrays.toString() : " + Arrays.toString(friends));

        for(String s3 : friends)
        {
            System.out.println(s3 + ", ");
        }


    }
}
