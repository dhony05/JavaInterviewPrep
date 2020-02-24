package jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnManagerWithProperties {

	
private static Connection connection = null;
	
	private static void makeConnection() throws SQLException {
		Properties props = new Properties();
		try {
			props.load(new FileInputStream("resources/config.properties"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		String URL = props.getProperty("url");
		String USERNAME = props.getProperty("username");
		String PASSWORD = props.getProperty("password");
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