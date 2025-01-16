package Arrays;

public class Arrays_Part2
{


    public static void main(String[] args)
    {
        int[]  newArray = new int[5];

        System.out.println("length of newArray : " + newArray.length);

        for(int i=0; i<newArray.length; i++)
        {
           // newArray[i]=newArray.length-i;
            System.out.print(i);
        }
        System.out.println();
        //----------- length VS length() ------------------
        String s1 = "Ahsan";
        System.out.println("length() of String-s1 : " + s1.length());

        //for(int i=5;i<=newArray.length;i--)
      //  {
        //    newArray[i]=newArray.length-i;
          //  System.out.println(newArray[i]);
     //   }

    //----------- Array is an object in java ---------------
    //------- We can assign array to any object in java ------------


        double[] salaries = {12,12,34,33,32};
        Object obj1 = salaries;
        System.out.println(obj1.toString());

        if(obj1 instanceof double[])
        {
            System.out.println("obj1 is an instance of double[]");
        }




    }
}
