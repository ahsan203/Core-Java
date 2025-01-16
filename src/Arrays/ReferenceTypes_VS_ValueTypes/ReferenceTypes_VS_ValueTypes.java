package Arrays.ReferenceTypes_VS_ValueTypes;

import java.util.Arrays;

public class ReferenceTypes_VS_ValueTypes
{
    public static void main(String[] args) {

        int[] arrayOne = new int[5];
        int[] copyArrOne = arrayOne;



        System.out.println("Array-One : " + arrayOne);
        System.out.println("Copy-Arr- : " + copyArrOne);
        System.out.println(" \"Both the above references are having same address, as they are pointing to same object in Heap-Area\" " +
                "              \n \t\t\t\t\t\t\t\t & \n \"If we modify one Reference, the other will Reference will also get modified.\" ");
        System.out.println("---------------------------------------------------------------------------------------------------------------");

        int[] newCopy = Arrays.copyOf(copyArrOne,copyArrOne.length);
        System.out.println("new-copy-array : " + newCopy);
    }
}
