package Practice.jdbc.durgesh.Part4;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Inserting_Images
{
    public static void main(String[] args) {

        try
        {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            String url = "jdbc:mysql://localhost:3306/youtube1";
            String username = "root";
            String password = "mysql";
            Connection con =  DriverManager.getConnection(url, username, password);

            String q1 = "insert into images(pic) values (?)";

           PreparedStatement pstmt = con.prepareStatement(q1);

            FileInputStream fis = new FileInputStream("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\jdbc\\durgesh\\Part4\\image1.jpg");
            pstmt.setBinaryStream(1,fis,fis.available());
            int i1 = pstmt.executeUpdate();

            System.out.println(i1 + " Row inserted.");
            con.close();


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
