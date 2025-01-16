package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Element_Challenge
{
    public static void main(String[] args)
    {
        int[] answer1 = readIntegers();
        System.out.println(Arrays.toString(answer1));

        System.out.println("Minimum-Element : " + findMin(answer1));

    }

    public static int[] readIntegers()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a list of Integers, separated by comma : ");
        String result = scan.nextLine();

        String[] result1 = result.split(",");

        int[] i1 = new int[result1.length];

        for(int i=0; i<result1.length; i++)
        {
            i1[i] = Integer.parseInt(result1[i]);
        }

        return i1;
    }

    public static int findMin(int[] arr)
    {

        Arrays.sort(arr);

        int min = arr[0];
        int max = arr[arr.length-1];

        /*int min = Integer.MAX_VALUE;

        for(int i : arr)
        {
            if(i<min)
            {
                min = i;
            }
        }

        return min;*/

        return min;
    }
}
