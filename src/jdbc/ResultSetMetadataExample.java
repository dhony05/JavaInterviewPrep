package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetadataExample {
	
	public static void main(String[] args) {
		
		try(Connection conn = ConnManagerWithProperties.getConnection()){
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
			
			ResultSetMetaData rsmd = rs.getMetaData();
			
			for(int col = 1; col <= rsmd.getColumnCount(); col ++) {
				
				String name = rsmd.getColumnName(col);
				
				int type = rsmd.getColumnType(col);
				String typeName = rsmd.getColumnTypeName(col);
				
				System.out.println(col + ": Name = " + name + ", Type Number = " + type + ", Type Name = " +typeName);
				
			}
			
			
		}
		catch(SQLException e ) {
			e.printStackTrace();
		}
		
	}

}
