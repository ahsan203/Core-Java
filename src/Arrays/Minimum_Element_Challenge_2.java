package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Element_Challenge_2
{
    public static void main(String[] args) {

        int result1 = readInteger();
        System.out.println(result1);

        int[] result2 = readElements(result1);
        System.out.println(Arrays.toString(result2));

        int result3 = findMin(result2);
        System.out.println(result3);

    }


    private static int readInteger()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements you want to enter : ");
        int i = scan.nextInt();

        return i;
    }

    private static int[] readElements(int i1)
    {
        Scanner scan = new Scanner(System.in);
        int [] arr = new int[i1];

        for(int i=0; i<i1; i++)
        {
            System.out.println("Enter your " + i + " element. ");
            arr[i] = scan.nextInt();
        }

        return arr;
    }


    private static int findMin(int[] arr)
    {
        Arrays.sort(arr);

        int minimum_element = arr[0];
        int maximum_element = arr[arr.length-1];

        return minimum_element;
    }
}
