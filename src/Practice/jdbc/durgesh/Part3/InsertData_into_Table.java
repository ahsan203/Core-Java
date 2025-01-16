package Practice.jdbc.durgesh.Part3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData_into_Table
{
    public static void main(String[] args)
    {
            try
            {
                Class.forName("com.mysql.cj.jdbc.Driver");

                String url = "jdbc:mysql://localhost:3306/youtube1";
                String username = "root";
                String password = "mysql";

                Connection con = DriverManager.getConnection(url, username, password);

                String q1 = "insert into table1(tId,tName,tCity) values (7027,'Ahsan Shareef Mohammed','Bloomingdale')";
                String q2 = "insert into table1(tId,tName,tCity) values (7025,'Zaki Rana','Melbourne')";
                Statement stmt = con.createStatement();

                int i1 =  stmt.executeUpdate(q1);
                int i2 = stmt.executeUpdate(q2);

                int i3 = i1 + i2;
                System.out.println(i3 + " Rows inserted");

                con.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
    }
}
