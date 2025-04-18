package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/spark1";
        String username = "root";
        String password = "system";
        String deletequery = "delete from students where id=?";

        try{
            Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement pr = con.prepareStatement(deletequery);
             pr.setInt(1, 6);
              pr.executeUpdate();




        }
        catch(Exception e){
            e.printStackTrace();

        }
    }
}
