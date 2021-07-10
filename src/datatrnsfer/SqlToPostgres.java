package datatrnsfer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlToPostgres {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/pravitrabandhan";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "";

	public void sqlTransfer() {
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to a selected database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected database successfully...");

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();

			 String sql = "SELECT id, caste_name, caste_id,caste_religion_id FROM caste"; 
			/*
			 * String sql =
			 * "SELECT profile_creater_id, profile_creater_name FROM profile_owner";
			 */
			ResultSet rs = stmt.executeQuery(sql);
			// STEP 5: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				int id = rs.getInt("id");
				 int r_id = rs.getInt("caste_religion_id"); 
				 int c_id = rs.getInt("caste_id"); 
				 String first = rs.getString("caste_name"); 

				// Display values
				System.out.print("ID: " + id);
				 System.out.print(", Age: " + c_id); 
				System.out.print(", First: " + first);
				 postTransfer(first, id,c_id,r_id); 
				/* postTransfer(first, id); */
			}
			rs.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					conn.close();
			} catch (SQLException se) {
			} // do nothing
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
	}

	 public void postTransfer(String caste_name, int id,int c_id,int r_id) { 
	/* public void postTransfer(String caste_name, int id) { */
		final String DB_URL = "jdbc:postgresql://ec2-18-215-99-63.compute-1.amazonaws.com:5432/df2hd780nhllgn";

		// Database credentials
		final String USER = "grrdvsocjkhbpj";
		final String PASS = "d0ea3aafe65bff96ebc8156563dd790de8a4ce94e07754c7a4fdde9d486be52e";
		String avb = "jdbc:postgresql://ec2-18-215-99-63.compute-1.amazonaws.com:5432/df2hd780nhllgn?"
				+ "user=grrdvsocjkhbpj&password=d0ea3aafe65bff96ebc8156563dd790de8a4ce94e07754c7a4fdde9d486be52e"
				+ "&ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";

		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 2: Register JDBC driver
			Class.forName("org.postgresql.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to a selected database...");
			conn = DriverManager.getConnection(avb);

			System.out.println("Connected database successfully...");

			// STEP 4: Execute a query
			System.out.println("Inserting records into the table...");
			stmt = conn.createStatement();

			
			  String sql = "INSERT INTO caste (id,caste_name,caste_id,caste_religion_id) " +
			  "VALUES (" + id + ","+"'" + caste_name +"'"+","+c_id+","+r_id+")";
			 
			
			/*
			 * String sql =
			 * "INSERT INTO profile_owner (profile_creater_id,profile_creater_name) " +
			 * "VALUES (" + id + ","+"'" + caste_name +"')";
			 */
			 
			System.out.println(sql);
			stmt.executeUpdate(sql);
			System.out.println("Inserted records into the table...");

		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					conn.close();
			} catch (SQLException se) {
			} // do nothing
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
	}// end main

	public static void main(String[] args) {

		new SqlToPostgres().sqlTransfer();
	}

}
