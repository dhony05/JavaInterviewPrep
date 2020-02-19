package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Period;

public class ResultSetExample {

	public static void main(String[] args) {
		
		
		try {
			
			Connection conn = ConnectionManager.getConnection();
			
			
			// create statement
			
			Statement stmt = conn.createStatement();
			
			
			ResultSet rs = stmt.executeQuery("select * from student");
			
			// point to first row in result set
			rs.first();
			
			// get column values for the first row
			System.out.println("\nID: " + rs.getInt(1));
			System.out.println("\nName: " + rs.getString("first_name") + " " + rs.getString("last_Name"));
			System.out.println("\nGender: " + rs.getString("gender"));
			System.out.println("\nD.O.B: " + rs.getDate("date_of_birth"));
			System.out.println("\nCredits: " + rs.getString("credits"));
			
			// print records from department
			rs = stmt.executeQuery("select * from department");
			
			// move to first record in rs
			rs.first();
			
			System.out.println("\n\nDEPARTMENTS");
			System.out.println("-----------------------------");
			
//			do {
//				int deptID = rs.getInt(1);
//				String deptName = rs.getString(2);
//				String deptPhone = rs.getString(3);
//				
//				System.out.println("ID: "+ deptID + "| Name: "+ deptName + " | Phone: "+ deptPhone);
//				
//			}while(rs.next()) ;
			
			System.out.println("\nSTUDENTS");
			
			System.out.println("------------------------------");
			
			rs = stmt.executeQuery("select * from student");
			rs.first();
			
			
			do {
			
				String stName = rs.getString(2);
				LocalDate  dob = rs.getDate(5).toLocalDate();
				LocalDate today = LocalDate.now();
				Period age = Period.between(dob, today);
				

				System.out.println(" Name: "+ stName+ "            Age: " +age.getYears()  );
				
			}while(rs.next()) ;
			
			rs.close();
			stmt.close();
			System.out.println("Connection closed");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
