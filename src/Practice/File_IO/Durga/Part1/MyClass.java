package Practice.File_IO.Durga.Part1;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MyClass {
    public static void main(String args[]) {

        Person p1 = new Person(7027,"Ahsan");
        System.out.println(p1);


        ObjectMapper mapper = new ObjectMapper();

        try {
            String jsonString = mapper.writeValueAsString(p1);

            System.out.println("Json-format : " + jsonString);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

class Person
{
    private int id;
    private String name;

    public Person(int id, String name)
    {
        this.id = id;
        this.name= name;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Person{id=" + id + ", name='" + name + "'}";
    }

}