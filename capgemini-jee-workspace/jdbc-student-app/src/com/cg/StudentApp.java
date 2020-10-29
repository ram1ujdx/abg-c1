package com.cg;
import java.sql.*;

public class StudentApp {

	public static void main(String[] args) {
		
		try {
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe",
														"system","password");
		
			if(con!=null) {
				System.out.println("Connection Successful");
			}
		
			Statement smt=con.createStatement();
			
			ResultSet rs=smt.executeQuery("select * from student");
		
			while(rs.next()) {
				System.out.print("ID - "+rs.getString("ID"));
				System.out.print("\tNAME - "+rs.getString("SNAME"));
				System.out.print("\tMARKS - "+rs.getFloat("MARKS"));
				System.out.println("\tPHONE - "+rs.getLong("PHONE_NO"));
			}
		
		
		
		} catch (SQLException e) {
			System.err.println("Connection Unsuccessful");
		}
		
		

	}

}
