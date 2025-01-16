package Practice.jdbc.durgesh.Part3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert_Data_PreparedStatement
{
    public static void main(String[] args) {

        try
        {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            String url = "jdbc:mysql://localhost:3306/youtube1";
            String username = "root";
            String password = "mysql";

            Connection con = DriverManager.getConnection(url, username, password);

            String q1 = "insert into table1(tName,tCity) values (?,?)";

            PreparedStatement pstmt =con.prepareStatement(q1);
            pstmt.setString(1,"Nomaan");
            pstmt.setString(2,"California");


            int i1 = pstmt.executeUpdate();

            System.out.println(i1 + " Row Inserted.....");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
