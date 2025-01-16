package Practice.jdbc.durgesh.Part5;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider
{
    public static Connection con;

    public static Connection getConnection()
    {
        try {
            if (con == null) {
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

                String url = "jdbc:mysql://localhost:3306/youtube1";
                String username = "root";
                String password = "mysql";
               con =  DriverManager.getConnection(url,username,password);
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }
}
