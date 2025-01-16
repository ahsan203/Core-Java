package Practice.LanguageFundamentals.Part6_7_8_9;

import java.util.Arrays;

public class Five
{
    public static void main(String[] args) {

        //--- Case-1 :

        String[] str = {"ahsan","shoeab","zaki"};

        Object[] obj = str;

        System.out.println("obj[] : " + Arrays.toString(obj));


        //--- Case-2 :
        int[] a = {10,20,30,50};
        int[] b = {70,80};

        System.out.println("a[] : " + Arrays.toString(a));

        a = b;

        System.out.println("a[] : " + Arrays.toString(a));


        //--- Case-3 :


    }
}
