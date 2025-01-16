package Practice.LanguageFundamentals.Part15;

public class CommandLineArgs
{
    public static void main(String[] args) {

        /*int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int sum = num1 + num2;

        System.out.println("Sum : " + sum);*/


        StringBuilder sb1 = new StringBuilder("Ahsan");
        String s1 = "Ahsan";
        Object o1 = new Object();

        System.out.println(sb1 instanceof Object);
        System.out.println(o1 instanceof  StringBuilder);

        System.out.println(s1 instanceof Object);
        System.out.println(o1 instanceof  String);

        //System.out.println(sb1 instanceof String);

    }
}
