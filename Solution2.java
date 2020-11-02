import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Activity{
 
 String string1,string2;
 String operator;
 public Activity(String string1, String string2, String operator){
   this.string1=string1;
   this.string2=string2;
   this.operator=operator;
 }
 
 public Activity(){}


}



public class Source {
  //Implement the two function given in description in here...
  
  public String handleException(Activity a){
    try{
    if(a.string1==null || a.string2==null){
      throw new NullPointerException("Null values found");
    }
    if(!a.operator.equals("+") && !a.operator.equals("-")){
      throw new Exception(a.operator);
    }
    }
    catch(NullPointerException ex){
      return ex.getMessage();
    }
    catch(Exception ex){
      return ex.getMessage();
    }
    return "No Exception Found";

  }

  public String doOperation(Activity a){
    String result="";
    switch(a.operator){
      case "+":
         result=a.string1+a.string2;
        break;
        case "-":
         StringBuilder sb=new StringBuilder(a.string1);
          int start=sb.indexOf(a.string2);
          int end=a.string2.length();
          if(start!=-1){
            sb.replace(start, start+end, "");
          }
          result=sb.toString();
          break;
    }
    return result;
    }
  


	// public static void main(String args[])throws Exception {
    
  //   Activity a=new Activity("HelloWorldLetsLearn", "World", "-");
  //   Source source=new Source();
  //   String result=source.handleException(a);
  //   System.out.println(result);

  //   result=source.doOperation(a);
  //   System.out.println(result);


	// }
}