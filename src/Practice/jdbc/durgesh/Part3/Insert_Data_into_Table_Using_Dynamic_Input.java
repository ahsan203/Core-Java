package Practice.jdbc.durgesh.Part3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert_Data_into_Table_Using_Dynamic_Input
{
    public static void main(String[] args) {

        try
        {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            String url = "jdbc:mysql://localhost:3306/youtube1";
            String username = "root";
            String password = "mysql";
            Connection con =  DriverManager.getConnection(url, username, password);

            String q1 = "insert into table1(tId,tName,tCity) values (?,?,?)";

            PreparedStatement pstmt = con.prepareStatement(q1);

            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter your Student-ID : ");
            int sid = Integer.parseInt(br1.readLine());
            System.out.println("Enter your Name : ");
            String name =br1.readLine();
            System.out.println("Enter your City : ");
            String city = br1.readLine();

            pstmt.setInt(1,sid);
            pstmt.setString(2,name);
            pstmt.setString(3,city);

            int i1 = pstmt.executeUpdate();
            System.out.println(i1 + " Row Inserted.");
            con.close();
 }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
