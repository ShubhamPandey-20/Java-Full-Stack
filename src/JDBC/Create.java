package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Create {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/spark1";
        String username = "root";
        String pass = "system";
        try{
            Connection con = DriverManager.getConnection(url, username, pass);
            Statement st = con.createStatement();
            String sql = "CREATE TABLE REGISTRATION " +
                    "(id INTEGER not NULL, " +
                    " first VARCHAR(255), " +
                    " last VARCHAR(255), " +
                    " age INTEGER, " +
                    " PRIMARY KEY ( id ))";
            st.executeUpdate(sql);

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
