import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.*;

public class abf {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection C=DriverManager.getConnection("jdbc:mysql://Localhost/Nationwide","root","root");
			Statement S= C.createStatement();
			//S.executeUpdate("insert into TDP1 values('peter')");
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}