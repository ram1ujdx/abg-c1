package com.cg;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritingProperties {

	public static void main(String[] args) {
		
		try {
			FileOutputStream output=new FileOutputStream("app.properties",true);
			Properties props=new Properties();
			props.put("college", "BVRIT");
			props.put("city","HYD");
		//props.put("email","mohan@yahho.com");
			props.store(output, "Student Properties");
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
