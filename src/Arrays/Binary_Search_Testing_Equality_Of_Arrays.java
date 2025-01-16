package Arrays;

import java.util.Arrays;
import java.util.Random;

public class Binary_Search_Testing_Equality_Of_Arrays
{
    public static void main(String[] args)
    {
        //--- Equality of Arrays -----------------------------
        int[] firstArray = getRandomArrays(10);
        System.out.println("first-Array : " + Arrays.toString(firstArray));

        int [] copyFirstArray = Arrays.copyOf(firstArray,firstArray.length);
        System.out.println("copyFirst-Array : " + Arrays.toString(copyFirstArray));

        if(Arrays.equals(firstArray,copyFirstArray))
        {
            System.out.println("Both Arrays are equal.");
        }

 //-------------    BinarySearch-Array ------------------------

        String[] s1 = {"Zoro","Ahsan","Shoeab","Zaki"};
        System.out.println(Arrays.toString(s1));

        Arrays.sort(s1);

        System.out.println("Arrays.sort() :" + Arrays.toString(s1) );

        if(Arrays.binarySearch(s1,"Zaki")>=0)
        {
            System.out.println("Found");
        }

    }

    public static int[] getRandomArrays(int len)
    {
        Random rando = new Random();
        int [] newIntInt = new int[len];

        for(int i=0; i<len; i++)
        {
            newIntInt[i] = rando.nextInt(51);
        }

        return newIntInt;
    }
}
