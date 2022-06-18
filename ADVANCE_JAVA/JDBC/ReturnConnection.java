package ADVANCE_JAVA.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ReturnConnection {
    // for the utility purpose since this code is always used::
    public Connection returnConnection() throws ClassNotFoundException, SQLException
    {
        //load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");// driver name
        // make connection
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","vd8DYewD@1");//url,username,passowrd
    }
}
