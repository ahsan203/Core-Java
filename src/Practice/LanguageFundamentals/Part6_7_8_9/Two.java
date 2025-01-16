package Practice.LanguageFundamentals.Part6_7_8_9;

import java.util.Arrays;

public class Two
{
    public static void main(String[] args) {

        int[][] marks = new int[3][5];

        marks[0][0] = 40;
        marks[0][1] = 50;
        marks[0][2] = 60;
        marks[0][3] = 80;
        marks[0][4] = 100;


        marks[1][0] = 45;
        marks[1][1] = 45;
        marks[1][2] = 80;
        marks[1][3] = 90;
        marks[1][4] = 200;


        marks[2][0] = 30;
        marks[2][1] = 90;
        marks[2][2] = 70;
        marks[2][3] = 50;
        marks[2][4] = 100;


        System.out.println(Arrays.deepToString(marks));




    }
}
