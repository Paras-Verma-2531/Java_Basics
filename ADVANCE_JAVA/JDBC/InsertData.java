package ADVANCE_JAVA.JDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection con= new ReturnConnection().returnConnection();
        /*
         dynamic query::queries where values are given at runtime;
        eg: insert into student values(?,?,?,?)"
        for such , we need PreparedStatement;
        create object for PreparedStatement;;
        */

        String query="insert into student values(?,?,?,?)";
        PreparedStatement stm=con.prepareStatement(query);
        // set the values::
        stm.setString(1,"Paras");
        stm.setString(2,"B-tech");
        stm.setInt(3,2);
        stm.setInt(4,3);
        stm.executeUpdate();// execute the query
        System.out.println(" dynamic data inserted");
        con.close();
    }
}
