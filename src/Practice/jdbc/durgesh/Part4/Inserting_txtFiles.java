package Practice.jdbc.durgesh.Part4;

import com.mysql.cj.jdbc.Driver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.concurrent.ExecutionException;

public class Inserting_txtFiles
{
    public static void main(String[] args) {

        try{
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);

            String url = "jdbc:mysql://localhost:3306/youtube1";
            String username = "root";
            String password = "mysql";
            Connection con =  DriverManager.getConnection(url, username, password);

            String q1 = "insert into images(pic) values (?)";

           PreparedStatement pstmt = con.prepareStatement(q1);
           BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\jdbc\\durgesh\\Part4\\Names.txt"));
           pstmt.setCharacterStream(1,br1);
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
