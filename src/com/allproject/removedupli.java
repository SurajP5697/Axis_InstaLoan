package com.allproject;

public class removedupli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String so = "pgood rgood";
		String p="";
	   char[]ch=so.toCharArray();
	   System.out.println(ch);
	   
	   for(int i=0;i<ch.length;i++) {
		   boolean f=false;
		   for(int j=i+1;j<ch.length;j++) {
			   if(ch[i]==ch[j]) {
		        	 f=true;
		        	 break;


			   }
		   }
		   if(f==false){
			   p=p+ch[i];

		   }
	   }
	   
//	      for (int i = 0; i<so.length()-1; i++ ) 
//	      {
//	         if (so.charAt(i)!=so.charAt(i+1)){
//	        	 
//	        	 p=p+so.charAt(i);
//	         }
//	      }
	      System.out.println(p);

	}

}
