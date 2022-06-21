package ADVANCE_JAVA.JDBC;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
public class SelectData {
    public static void main(String[] args)throws SQLException,ClassNotFoundException {
        Connection con= new ReturnConnection().returnConnection();
        String query=" select * from student";// statement query
        Statement stm= con.createStatement();
       ResultSet set= stm.executeQuery(query); // data stores in ResultSet
        while(set.next())//place the cursor to next column
        {
            String name=set.getString(1);
            String course=set.getString(2);
            int year=set.getInt(3);
            int sems=set.getInt(4);
            System.out.println(name+ " : "+course+" : "+year+" : "+sems);//printData
        }con.close();
    }

}
