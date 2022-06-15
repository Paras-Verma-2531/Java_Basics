package ADVANCE_JAVA.JDBC;
public class DatabaseConnection {
    /*
    =======================
    Steps required for Database connection::
    --------------------------------------
    Step 1: load the driver[make the driver active]
             1st way: Class.forName("com.mysql.jdbc.Driver")// under try catch block
             2nd way: DriverManager.registerDriver(new com.mysql.jdbc.Driver());
             ==========================
             import java.sql package
             ==========================
    Step 2: make the connection::[ build the road]
        call getConnection method of driverManager class which returns connection object
        Connection con= DriverManager.getConnection("url","username","password");
        url format: "jdbc:mysql://localhost(if both are on same computer):portname:/dbname"
        localhost IP address: 127.0.0.1
        username : root
        password: password of database
        dbname : name of database in which u want to work
        ======================
    Step 3: create query/statement/PreparedStatement/CallableStatement
        eg: String s= " select * from students";//statement
        Statement stm=con.createStatement();// to get statement object
        ResultSet set= stm.executeQuery(s);

        ============================
    Step 4: Process data from the set
              while(set.next())  //set.next()==> will take to the next row if present
              {
                // operations
                int id= set.getInt("column name"/"column number");
                String st= set.getString("column name"/"column number");
                System.out.println(id);
                System.out.println(name);
                 }
    ================================================
    Step 5: close the connection::
        con.close();


     */
}
