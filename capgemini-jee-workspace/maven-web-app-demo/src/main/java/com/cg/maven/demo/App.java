package com.cg.maven.demo;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App {
	static Logger myLogger=LogManager.getLogger(App.class);
	public static void main(String[] args) {
		myLogger.info("Error");
	}
}
