package Practice.Serialization.Durgesh;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial
{
    public static void main(String[] args) throws IOException {

        Student ahsan = new Student("Ahsan Shareef Mohammed","ahsan2@gmail.com",28,"Bloomingdale, IL");

        FileOutputStream fos = new FileOutputStream("C:\\Users\\farna\\Desktop\\Java_Practice\\TimBas\\src\\Practice\\Serialization\\Durgesh\\Student_Serial.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //------how to serialize ----------

        oos.writeObject(ahsan);

        fos.close();
        oos.close();

        System.out.println("Object state is transferred into file...");

    }
}
