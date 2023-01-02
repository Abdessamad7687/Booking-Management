package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connexion {
	private static final String url = "jdbc:mysql://localhost:3306/gestionreservations";
	private static final String user="root";
	private static final String password="";
	private static Connection con=null;
	
	static{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
		} catch(SQLException e) {
				e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Error loading driver");
		} 
	}

	public static Connection getCon() {
		return con;
	}
	
	
}
