package Practice.java_lang.Part9_Wrapper;

public class toString
{
    public void areaOfRectangle(int countryCode, int phoneNumber)
    {
            String s1 = Integer.toString(countryCode);
            String s2 = Integer.toString(phoneNumber);

            String fullPhone = "+" + s1+s2;

            System.out.println("Phone : " + fullPhone);
    }

    public static void main(String[] args) {

        toString t1 = new toString();
        t1.areaOfRectangle(1,2019823527);
    }
}
