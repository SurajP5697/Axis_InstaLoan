package com.allproject;

import java.util.Stack;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String so = "good good ooodaa rajja koo  ";
		so.trim();
		String p="";
	   
	      for (int i = 0; i<so.length()-1; i++ ) 
	      {
	         if (so.charAt(i)!=so.charAt(i+1)){
	        	 
	        	 p=p+so.charAt(i);
	         }
	      }
	      System.out.println(p);
	      System.out.println(p+so.charAt(so.length()-1));
	      
	}

}
