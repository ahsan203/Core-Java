package Practice.InterviewQuestions.Ascending_Descending;

import java.util.Arrays;

public class Ascending_Descending_Arrays
{

    public static void main(String[] args) {

        int[] arr1 = {7040,7035,7028,7018,7027};

        System.out.println("arr1 : " + Arrays.toString(arr1));

        System.out.println("Asc : " + Arrays.toString(ascendingOrder(arr1)));

        System.out.println("Desc : " + Arrays.toString(descendingOrder(arr1)));

    }

    private static int[] ascendingOrder(int[] arr)
    {
        int temp;

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    private static int[] descendingOrder(int[] arr)
    {
        int temp;

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] < arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}
