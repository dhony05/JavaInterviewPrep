package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BetterConnManager {
	

	private static final String URL = "jdbc:mysql://localhost:3306/university?serverTimezone=EST5EDT";
	// mac or linux : ?serverTimezone=EST5EDT
	private static final String USERNAME = "root";
	private static final String PASSWORD = "1a234567";
		
	
	private static Connection connection = null;
	
	private static void makeConnection() throws SQLException {
		connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		
	}
	
	public static Connection getConnection() throws SQLException {
		
		if( connection == null || connection.isClosed()) {
			makeConnection();
		}
		
		
		
		return connection;
	}
	
	public static void main(String[] args) { 
		
		try(Connection conn = BetterConnManager.getConnection()){
			System.out.println("Connection openend");
			
			conn.close();
			
			System.out.println("Connection closed");
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	

}
