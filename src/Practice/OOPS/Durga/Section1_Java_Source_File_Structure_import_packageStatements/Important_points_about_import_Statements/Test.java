package Practice.OOPS.Durga.Section1_Java_Source_File_Structure_import_packageStatements.Important_points_about_import_Statements;


public class Test
{
    public static void main(String[] args) {

        Student ahsan = new Student();
    //--- static method can be called using object-reference also.....
        ahsan.m1();
        Student.m1();
    }
}
