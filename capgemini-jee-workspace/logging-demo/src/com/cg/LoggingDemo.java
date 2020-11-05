package com.cg;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class LoggingDemo {

	public static void main(String[] args) {
		
		Logger logger=Logger.getLogger(LoggingDemo.class);
		logger.setLevel(Level.DEBUG);

		logger.error("This is an Error");
		

	}

}
