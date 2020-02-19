package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatemensExample {

	public static void main(String[] args) {
		
		try {
			Connection conn = ConnectionManager.getConnection();
			
			
			// create statement
			
			Statement stmt = conn.createStatement();
			
			// statement -> used to update data
			
			int count = stmt.executeUpdate("update student set credits = 85 where student_id = 10000");
			
			System.out.println("Statement returned: " + count);
			
			count = stmt.executeUpdate("update student set credits = 5 where credits < 5");
			
			System.out.println("Statement returned: " + count);
			
			// executeUpdate will return count of rows update (update ,create, delete)
			// -> DML statemts for update, create, delete
			
			
			count = stmt.executeUpdate("insert into student values(null, 'new', 'Rbbb', 'M', '1997-01-09', 90, 10008, 10008);");
			
			System.out.println("Students inserted: "+ count);
			
			count = stmt.executeUpdate("delete from student where first_name = 'new'");
			
			System.out.println("Students deleted: "+ count);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
