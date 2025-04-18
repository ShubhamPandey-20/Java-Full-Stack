package JDBC;

import java.sql.*;

public class Insert {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/spark1";
        String username = "root";
        String password = "system";
        String insert = "insert into students(name, age, course) values(?,?,?)";


        try {
            //Driver loaded
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Connection Loaded
            Connection con = DriverManager.getConnection(url , username , password);
            // Prepare Statement
            PreparedStatement pr = con.prepareStatement(insert);
            pr.setString(1 ,"Satyam");
            pr.setInt(2, 21);
            pr.setString(3, "Mern");
            pr.executeUpdate();
            //Query execute

            //Get result(Kaise nikale data)
        }
        catch(Exception e){

        }

    }

}

