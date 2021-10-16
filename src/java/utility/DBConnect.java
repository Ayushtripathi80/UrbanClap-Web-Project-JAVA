
package utility;

import java.sql.*;
public class DBConnect {
    Connection conn=null;
    public DBConnect() throws Exception
    {
       Class.forName("oracle.jdbc.OracleDriver");
       conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
    }
    public void queryExecuter(String sql) throws Exception//insert,update,delete//DML//menupulation
    {
        Statement stat=conn.createStatement();
        stat.execute(sql);
        stat.close();
        conn.close();
        
    }
    public ResultSet queryReturner(String sql) throws Exception
    {//ddl select//data definition language
        ResultSet rs=null;
        Statement stat=conn.createStatement();
        rs=stat.executeQuery(sql);
        return rs;
    }
    
}
