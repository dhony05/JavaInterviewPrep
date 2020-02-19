package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	
	// info needed to connection: url, username, password
	
	private static final String URL = "jdbc:mysql://localhost:3306/university?serverTimezone=EST5EDT";
	
	// mac or linux : ?serverTimezone=EST5EDT
	private static final String USERNAME = "root";
	private static final String PASSWORD = "1a234567";
	
	public static Connection getConnection() {
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			System.out.println("Connected to database");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void main(String[] args) {
		
		Connection conn = ConnectionManager.getConnection();
		
		
		
		try {
			conn.close();
			System.out.println("Connection Closed");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
