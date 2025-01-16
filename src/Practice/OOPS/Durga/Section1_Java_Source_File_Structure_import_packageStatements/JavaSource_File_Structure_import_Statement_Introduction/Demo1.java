package Practice.OOPS.Durga.Section1_Java_Source_File_Structure_import_packageStatements.JavaSource_File_Structure_import_Statement_Introduction;

public class Demo1
{

    public static void main(String[] args) {

        //---------- Using fully qualified-name of ArrayList Instead of importing....

        java.util.ArrayList al = new java.util.ArrayList();

        al.add("Ahsan");
        al.add("Zaki");
        al.add("shoeab");

        System.out.println(al);
    }
}
