package Practice.jdbc.durgesh.Part4;

import javax.swing.*;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Inserting_Large_Images
{
    public static void main(String[] args) throws IOException {

        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            String url = "jdbc:mysql://localhost:3306/youtube1";
            String username = "root";
            String password = "mysql";
            Connection con = DriverManager.getConnection(url,username,password);

            String q1 = "insert into images(pic) values (?)";
            PreparedStatement pstmt = con.prepareStatement(q1);

            //FileInputStream fis2 = new FileInputStream("C:\\Users\\farna\\Desktop\\TimBas\\src\\Practice\\jdbc\\durgesh\\Part4\\image2.jpg");

            JFileChooser jfc = new JFileChooser();
            jfc.showOpenDialog(null);
           File f1 = jfc.getSelectedFile();
           FileInputStream fis2 = new FileInputStream(f1);
           pstmt.setBinaryStream(1,fis2,fis2.available());

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
