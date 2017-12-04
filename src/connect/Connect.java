/**
 * @DATEDec 4, 2017
 * @YEAR2017
 * @PROJECTNAMEThan_Van_Duong_Servlet
 *
 */
package connect;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author User
 *
 */

public class Connect{
  public Connect() {
  }

public void connect() throws ClassNotFoundException {
  Connection connect = null;
  java.sql.Statement s = null;

  try {
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

    connect = DriverManager
        .getConnection("" + "jdbc:sqlserver://localhost:1433;databaseName=DANGKIHOC;user=TestDB;password=12345678");

    s = connect.createStatement();

    String sql = "SELECT * FROM  Employees ORDER BY EmployeeID ASC";

    ResultSet rec = s.executeQuery(sql);
}catch(SQLException e) {
  System.err.println("error connect to database...");
}
}
}
