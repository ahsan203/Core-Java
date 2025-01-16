package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;

public class ArrayChallengeExercise
{
    public static void main(String[] args)
    {
        int[] a1 = getRandomArray(5);
        System.out.println("Un-Sorted-array : " + Arrays.toString(a1));
        Arrays.sort(a1);
        System.out.println("Sorted-Array : " + Arrays.toString(a1));

        System.out.println("Desceding-Order : " + Arrays.toString(descendingArray(a1)));

    }


    public static  int[] getRandomArray(int len)
    {
        Random random = new Random();

        int[] newInt = new int[len];

        for(int i=0;i<len;i++)
        {
            newInt[i] = random.nextInt(50);
        }

        return newInt;
    }

    public static int[] descendingArray(int[] arr)
    {
        int temp;
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j< arr.length; j++)
            {
                if(arr[i] < arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

}