package Practice.LanguageFundamentals.Part6_7_8_9;

import java.util.Arrays;

public class Three
{
    public static void main(String[] args) {

        int[][][] x = {{{10,20,30},{40,50,60}},{{70,80},{90,100,110}}};

        System.out.println(x[0][1][2]);

        System.out.println(Arrays.deepToString(x));

     //----- We can use both for and for-each loop to iterate above 3-D Array

        System.out.println("for-each : ");
        for(int[][] x1 : x)
        {
            for(int[] x2 : x1)
            {
                for(int x3 : x2)
                {
                    System.out.println(x3);
                }
            }
        }

        System.out.println("--------------------------------------------");

        System.out.println("for-loop : ");
        for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<x[i].length;j++)
            {
                for(int k=0;k<x[i][j].length;k++)
                {
                    System.out.println(x[i][j][k] + " ");
                }
                //System.out.println();
            }
            //System.out.println();
        }
    }
}
