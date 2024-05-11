package com.allproject.String;

public class firstSting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="  Raja is    good  ";
		//s.trim();
		String p=s.trim();
		String ko=s.replaceAll("\\s", "");
		System.out.println(ko);
		System.out.println(ko.substring(-1,5));
		 String str = " This is an example    ";
	      
		 String newStr= str.replaceAll("\\s", "");
		 /* method will replace/remove all the whitespaces as per passed parameters */ 
		      
		    System.out.println(newStr);  
		    
		  }
	}


