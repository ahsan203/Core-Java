package Arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArrayChallenge {
    public static void main(String[] args) {

      /*  Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int n1= scan.nextInt();
        System.out.println("Enter Second number : ");
        int n2 = scan.nextInt();
        System.out.println("Enter third number : ");
        int n3 = scan.nextInt();
        System.out.println("Enter fourth number : ");
        int n4 = scan.nextInt();
        System.out.println("Enter Fifth number : ");
        int n5 = scan.nextInt();

        int[] arr = {n1,n2,n3,n4,n5};
        System.out.println(Arrays.toString(arr));*/

        int arr[] = getInteger(5);
        System.out.println(Arrays.toString(arr));

       /* int[] ggg = {34,5,450,0,9};
        System.out.println(Arrays.toString(sortIntegers(ggg)));

        printArray(ggg);*/

    }

    public static int[] getInteger(int size) {
        int[] firstArray = new int[size];

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < size; i++) {

            //System.out.println("Enter " + i + " number : ");
            firstArray[i] = scan.nextInt();
        }

        return firstArray;
    }

    public static int[] sortIntegers(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + " contents " + arr[i]);
        }
    }


}
