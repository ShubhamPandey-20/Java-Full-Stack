package JDBC;

import java.sql.*;

public class Fetchstudent {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/spark1";
        String username = "root";
        String password = "system";
        String query = "select * from students";
        try {
            //Driver loaded
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Connection Loaded
            Connection con = DriverManager.getConnection(url , username , password);
            // Create Statement
            Statement st = con.createStatement();
            //Query execute
             ResultSet re =st.executeQuery(query);
             //Get result(Kaise nikale data)
            System.out.println("ID | Name | Age | Course");
            while(re.next()){
                System.out.println(re.getInt("id")+ re.getString("name")+ re.getString("Course"
                )+re.getInt("Age"));
            }



        }
        catch(Exception e){

        }

    }
}
