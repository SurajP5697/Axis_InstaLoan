package com.allproject;

public class Stringdupli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String so = "good good ropr  ";
		String p="";                // god
	   
	      for (int i = 0; i<so.length(); i++ ) 
	      {
	    	  char c=so.charAt(i);
	    	  int ind=so.indexOf(c,i+1);
	         if (ind==-1){
	        	 
	        	 p=p+so.charAt(i);
	         }
	      }
	      System.out.println(p);
	      System.out.println(p+so.charAt(so.length()-1));
	}

}
