package com.cg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class RegularExpressions {
	
	

	public static void main(String[] args) {
		
		
		
		Pattern pattern=Pattern.compile("[a-z]{2}");
		String str="xyz1ab2678cd";
		Matcher matcher=pattern.matcher(str);
		while(matcher.find()){
			System.out.println(matcher.group()+" - "+matcher.start()+" : "+matcher.end());
		}
	

	}

}
