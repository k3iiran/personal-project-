import java.sql.DriverManager;
import java.sql.*;

public class ResultSetdraft {
	public static void main(String[] args) {
		Connection c;
        Statement s;
		try {  
		 Class.forName("com.mysql.cj.jdbc.Driver");
         c = DriverManager.getConnection("jdbc:mysql://localhost/nationwide", "root", "root");
         s = c.createStatement();
         s.executeUpdate("set global time_zone='-1:00';");
       ResultSet Rs= (ResultSet) s.executeQuery("select* from tdp");
       while(Rs.next()) {
    	   System.out.println(Rs.getInt(1));
    	   System.out.println(Rs.getString(2));
    	   System.out.println(Rs.getInt(3));
       }
	}
	catch (Exception E4){
		System.out.println(E4.toString());
		}
	}
}
