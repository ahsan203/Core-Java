package Practice.InnerClasses.Durga.Part3;

class Popcorn
{
    public void taste()
    {
        System.out.println("Salty-Popcorn");
    }

}
class Test1
{
    public static void main(String[] args) {

// ---- Creating Anonymous-Inner-Class for Spicy-Popcorn functionality.... -----------
        Popcorn p1 = new Popcorn()
        {
            @Override
            public void taste() {
                System.out.println("Spicy-Popcorn");
            }
        };
        p1.taste();

// ---- Just Calling Normal Popcorn class  -----------
        Popcorn p = new Popcorn();
        p.taste();

// ---- Creating Anonymous-Inner-Class for Sweet-Popcorn functionality.... -----------
        Popcorn p2 = new Popcorn()
        {
          public void taste()
          {
              System.out.println("Sweet-Popcorn");
          }
        };
        p2.taste();
    }
}
