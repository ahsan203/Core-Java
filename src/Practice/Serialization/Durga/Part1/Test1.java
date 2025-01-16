package Practice.Serialization.Durga.Part1;

import java.io.*;

class Dog implements Serializable
{
   transient int i =10;
    int j = 20;
}
public class Test1
{
    public static void main(String[] args) throws IOException,ClassNotFoundException{

        Dog d1 = new Dog();

    //---- Serialization Process -----
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\Serialization\\Durga\\Part1\\serailization.txt"));
        oos.writeObject(d1);
        oos.flush();
        oos.close();

    //--- DeSerialization ----
        FileInputStream fis = new FileInputStream("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\Serialization\\Durga\\Part1\\serailization.txt");
        ObjectInputStream ois  = new ObjectInputStream(fis);
        Dog d2 = (Dog) ois.readObject();

        System.out.println(d2.i + "------------ " + d2.j);
    }
}
