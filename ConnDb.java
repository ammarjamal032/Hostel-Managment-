/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBCon;
import java.sql.*;


public class ConnDb {
    
    public Connection con=null;
    public ResultSet rs=null;
    public PreparedStatement pstmt=null;
    public ConnDb()
    {
    String url="jdbc:oracle:thin:@localhost:1521:XE";
    try
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con = DriverManager.getConnection(url,"host","host");  
        System.out.println("Success");
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
    
    }
}
