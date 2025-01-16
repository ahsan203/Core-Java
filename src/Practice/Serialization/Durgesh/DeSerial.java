package Practice.Serialization.Durgesh;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerial
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("C:\\Users\\farna\\Desktop\\Java_Practice\\TimBas\\src\\Practice\\Serialization\\Durgesh\\Student_Serial.txt");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Student ahsan = (Student) ois.readObject();

        ahsan.displayName();

        System.out.println(ahsan.getName());
        System.out.println(ahsan.getEmail());
        System.out.println(ahsan.getAge());
        System.out.println(ahsan.getAddress());


    }
}
