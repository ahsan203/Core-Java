package Practice.jdbc.durgesh.Part1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FirstJDBC
{
    public static void main(String[] args) {

        try
        {
            //--------- Step-1 : Load the driver.........
            //Class.forName("com.mysql.cj.jdbc.Driver");
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());


            //----- Step-2 : Create Connection

            String url = "jdbc:mysql://localhost:3306/youtube1";
            String username = "root";
            String password = "mysql";

           Connection con =  DriverManager.getConnection(url, username, password);

           //--- Checking whether connection got created or not ....
            if(con.isClosed())
            {
                System.out.println("Connection is closed....");
            }
            else
            {
                System.out.println("Connection has been established.");
            }

                con.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}
