package cg.logging_mvn_demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Hello world!
 *
 */
public class App 
{
	static Logger myLogger =  Logger.getLogger(App.class.getName());
	Object x;

	public void do_something( int a, float b)
	{
		myLogger.info("do_something are: " + a +" "+ b); 
		myLogger.debug("Operation performed successfully");
		if (x == null)
		{
		myLogger.error("Value of X is null");

		}
	}

	
    public static void main( String[] args )
    {
      
       PropertyConfigurator.configure("log-props.properties");
       
      App app=new App();
      app.do_something(5, 10);
      
    }
}
