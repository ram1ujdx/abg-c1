package com.cg;
import java.util.Scanner;



public class StringLabProgram {
    public static void main(String args[])
    {
        System.out.println("Enter the choice");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch (choice) {
        case 1:
        
    String input1 = new String("abbc");
            String input2 = new String("cbde");
            String result = input1+input2;
            System.out.println(result);
            break;
        
        case 2:
            //removing duplicate characters
        
            String str="ABBBAA";
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<str.length();i++) {
                char ch=str.charAt(i);
                int index=str.indexOf(ch,i+1);
                if(index==-1) {
                    sb.append(ch);
                }
            }
                System.out.println(sb);
                break;
        
    
        case 3:
        
            //replacing odd characters
            
            
    
                
                String str1="aaaaaa";
                String str4="";
          
       
                
                int length=str1.length();
                for(int i=0;i<str1.length();i++) {
                    if(i%2==0)
                    {
                        str4+=str1.charAt(i);
                    }
                    else
                    {
                
                        //str4+="#";
                    	str4+= String.valueOf(str1.charAt(i)).toUpperCase();
                        
                    }
                }
                System.out.println("The string after replacing odd values is " +str4);
                
        
            
    }
}
}