package Practice.jdbc.durgesh.Part6;

import Practice.jdbc.durgesh.Part5.ConnectionProvider;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Selecting_Data
{
    public static void main(String[] args) {

        try
        {
           Connection con = ConnectionProvider.getConnection();

           String q1 = "select * from table1";

           Statement stmt = con.createStatement();
           ResultSet set = stmt.executeQuery(q1);

           while(set.next())
           {
              int tid = set.getInt(1);
              String tName = set.getString("tName");
              String tCity = set.getString(3);

               System.out.println("Name : " +tName);
               System.out.println("Id : " + tid);
               System.out.println("City : " + tCity);
               System.out.println("--------------------------");
           }

           con.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
