package ADVANCE_JAVA.JDBC;
import java.sql.*;
public class createTable {
    public static void main(String[] args)throws ClassNotFoundException,SQLException {
        //load driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        // make connection
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","vd8DYewD@1");
         String query=" create table student(name varchar(30) not null, course varchar(10) not null,year int,semester int)";
         // create statement object
        Statement stm= con.createStatement();
        stm.executeUpdate(query);// execute query
        System.out.println("table created");
        /* String query1="drop table student";
        stm.executeUpdate(query1);
        System.out.println("table deleted");
        */
    }


}
