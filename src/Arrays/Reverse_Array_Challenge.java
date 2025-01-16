package Arrays;

public class Reverse_Array_Challenge
{
    public static void main(String[] args) {

        int[] a1 = {23,56,43};

        System.out.println(reverseArray(a1));
    }

    private static int[] reverseArray(int[] arr)
    {
        int temp;
        int[] arr1 = new int[arr.length];

        for(int i=0; i<arr.length; i++)
        {
                temp = arr[i+1];
                arr[i+1] = arr1[i-1];
                arr1[i-1] = temp;
        }

        return arr1;

    }
}
