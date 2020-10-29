package com.cg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteStudent {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "system", "password");

			if (con != null) {
				System.out.println("Connection Successful");
			}

			
			PreparedStatement psmt=con.prepareStatement("delete from student where id=?");
			System.out.println("Enter the ID : ");
			String id=scan.nextLine();
			psmt.setString(1, id);
			int totalRowsDeleted=psmt.executeUpdate();
			if(totalRowsDeleted>0) {
				System.out.println("Deleted "+totalRowsDeleted+" records");
			}
			else {
				System.out.println("No Data Found for ID : "+id);
			}
			
			
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
