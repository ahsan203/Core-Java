package Practice.jdbc.durgesh.Part5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Updating_Data_In_Table
{
    public static void main(String[] args)
    {
        try {

           Connection con =  ConnectionProvider.getConnection();

           String q1 = "update table1 set tName = ? , tCity = ? where tID=7028";
           PreparedStatement pstmt = con.prepareStatement(q1);

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter your updated name : ");
            String name = scan.nextLine();

            System.out.println("Enter your City : ");
            String city = scan.nextLine();

           pstmt.setString(1,name);
           pstmt.setString(2,city);

           int i1 = pstmt.executeUpdate();
           System.out.println(i1 + " Row Inserted.");
           con.close();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
