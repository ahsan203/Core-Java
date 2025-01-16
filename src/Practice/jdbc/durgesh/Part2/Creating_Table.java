package Practice.jdbc.durgesh.Part2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Creating_Table
{
    public static void main(String[] args) {

            try
            {
                Class.forName("com.mysql.cj.jdbc.Driver");

                String url = "jdbc:mysql://localhost:3306/youtube1";
                String username = "root";
                String password = "mysql";

                Connection con = DriverManager.getConnection(url, username, password);

                if(con.isClosed())
                {
                    System.out.println("Connection is closed...");
                }
                else
                {
                    System.out.println("Connection got created....");
                }

                String q1 = "create table table1(tId int(10) primary key auto_increment, tName varchar(200) not null, tCity varchar(500) )";

                Statement stmt =con.createStatement();
                int i1 = stmt.executeUpdate(q1);
                System.out.println("Table got created....");

                con.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
    }
}
