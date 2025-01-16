package Arrays;

import java.util.Arrays;
import java.util.Random;

public class Sort_Fill_CopyOf
{
    public static void main(String[] args)
    {
//----------- Arrays.sort(); --------------------

        int [] firstArray = getRandomArray(10);
        System.out.println( "firstArray : " + Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println("Sorted-firstArray : " + Arrays.toString(firstArray));
        System.out.println("------------------------------------------------------------");
//--------------- Arrays.fill() -----------------------------
        int [] secondArray = getRandomArray(10);
        System.out.println("Second-Array : " + Arrays.toString(secondArray));
        Arrays.fill(secondArray,29);
        System.out.println("Filled by 29 Second-Array : " + Arrays.toString(secondArray));
        System.out.println("---------------------------------------------------------------");

//------------ Arrays.copyOf() ---------------------------------------------------

       int []  thirdArray = getRandomArray(10);
        System.out.println("Third-Array : " + Arrays.toString(thirdArray));
        int [] thirdArrayCopy = Arrays.copyOf(thirdArray,5);
        Arrays.sort(thirdArrayCopy);
        System.out.println("Sorted third Array-Copy : " + Arrays.toString(thirdArrayCopy));

    }

    public static int[] getRandomArray(int len)
    {
        Random random = new Random();

        int[] newInt = new int[len];

        for(int i=0; i<len; i++)
        {
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }
}
