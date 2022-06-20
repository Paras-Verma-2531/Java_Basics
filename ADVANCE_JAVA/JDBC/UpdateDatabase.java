package ADVANCE_JAVA.JDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDatabase  {
    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        Connection con= new ReturnConnection().returnConnection();
        String query="update student set name=? where name=?";//PreparedStatement
        PreparedStatement ptm= con.prepareStatement(query);
        Scanner in= new Scanner(System.in);
        System.out.print("enter the new name : ");
        String newname= in.nextLine();
        System.out.print("enter the previous name : ");
        String oldname= in.nextLine();
        ptm.setString(1,newname);
        ptm.setString(2,oldname);
        ptm.executeUpdate();
        System.out.println("successfully updated the name");

    }

}
