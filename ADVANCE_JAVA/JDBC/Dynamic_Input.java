package ADVANCE_JAVA.JDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class Dynamic_Input {
    public static void main(String[] args)throws ClassNotFoundException, SQLException {
        Connection con = new ReturnConnection().returnConnection();
        String query = "insert into student values(?,?,?,?)";
        PreparedStatement ptm = con.prepareStatement(query);
        Scanner in = new Scanner(System.in);
        // dynamic input from user::
        for (int i = 1; i <= 2; i++) {
            System.out.print("enter your name : ");
            String name = in.nextLine();
            ptm.setString(1,name);
            System.out.print("enter your course : ");
            String course = in.nextLine();
            ptm.setString(2,course);
            System.out.print("enter your year : ");
            int year = in.nextInt();
            ptm.setInt(3,year);
            System.out.print("enter your semester : ");
            int sems = in.nextInt();
            ptm.setInt(4,sems);
            ptm.executeUpdate();
            in.nextLine();
        }
        con.close();
    }
}
