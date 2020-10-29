package com.cg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateStudent {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "system", "password");

			if (con != null) {
				System.out.println("Connection Successful");
			}

			PreparedStatement psmt=con.prepareStatement("update student set marks=? where id=?");
			System.out.println("Enter Student ID");
			String id=scan.nextLine();
			System.out.println("Enter new Marks : ");
			float marks=scan.nextFloat();
		
			psmt.setString(2, id);
			psmt.setFloat(1, marks);
			
			int rowsUpdateCount=psmt.executeUpdate();
			
			if(rowsUpdateCount>0) {
				System.out.println(rowsUpdateCount+"Records updated Successfully");
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
