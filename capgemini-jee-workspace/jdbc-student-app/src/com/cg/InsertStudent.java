package com.cg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertStudent {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "system", "password");

			if (con != null) {
				System.out.println("Connection Successful");
			}

			Statement smt = con.createStatement();
			
			String sname,id;
			long phoneNo;
			float marks;
			
			System.out.println("Enter ID : ");
			id=scan.nextLine();
			System.out.println("Enter Name : ");
			sname=scan.nextLine();
			System.out.println("Enter Marks : ");
			marks=scan.nextFloat();
			System.out.println("Enter Phone : ");
			phoneNo=scan.nextLong();
			
			
			int rowsUpdateCount=smt.executeUpdate("insert into student values('"+id+"','"+sname+"',"+marks+","+phoneNo+")");
			
			if(rowsUpdateCount>0) {
				System.out.println("Inserted Successfully");
			}
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
