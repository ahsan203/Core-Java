package Practice.java_lang.Part3_equals;

public class Example2
{
    private String name;
    private int roll;

    public Example2(String name, int roll)
    {
        this.roll=roll;
        this.name=name;
    }

  //--------- Overriding .equals() method for content-comparison of 2 objects ------------------

  public boolean equals(Object obj)
  {
      try {
        //--- Object-1
          String name1 = this.name;
          int roll1 = this.roll;
        //--- Object-2
          Example2 ex2 = (Example2) obj;

          String name2 = ex2.name;
          int roll2 = ex2.roll;

      //------ Now comparing both names & roll-numbers of both object's.
          if ((name1.equals(name2)) && (roll1 == roll2)) {
              return true;
          }

          return false;
      }
        catch (ClassCastException e)
        {
                 return false;
        }
      catch (NullPointerException e)
      {
          return false;
      }
  }

    public static void main(String[] args) {

        Example2 s1 = new Example2("Ahsan",7027);
        Example2 s2 = new Example2("Shoeab",7018);
        Example2 s3 = new Example2("Ahsan", 7027);
        Example2 s4 = s1;

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));

        System.out.println(s1.equals("Ahsan")); //----------- ClassCastException ----------

        System.out.println(s1.equals(null)); // ------------ NullPointerException --------------
    }
}
