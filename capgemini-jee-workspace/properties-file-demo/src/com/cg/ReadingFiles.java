package com.cg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingFiles {

	public static void main(String[] args) {
		FileInputStream input = null;
		try {
			input=new FileInputStream("app.properties");
			
			Properties props=new Properties();
			props.load(input);
			
			System.out.println(props.getProperty("city"));
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
