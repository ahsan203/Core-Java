package Practice.InnerClasses.Durga.Part1;

public class Test1
{
    public static void main(String[] args) {

        Outer4 o4 = new Outer4();
        Outer4.Inner4 i4 = o4.new Inner4();
        i4.m1();

        //------ 2nd way of creating objects :
        Outer4.Inner4 i5 = new Outer4().new Inner4();
        i5.m1();

        //----- 3rd way :
        new Outer4().new Inner4().m1();
    }
}
