package ADVANCE_JAVA.JDBC;
import java.sql.*;
public class Connection_setup {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");// driver name
        // make connection
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","vd8DYewD@1");//url,username,passowrd
        // make query
        if(con.isClosed())
            System.out.println("connection is still closed");
        else
            System.out.println("connection is open");
    }
}
