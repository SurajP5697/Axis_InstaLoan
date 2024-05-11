package com.allproject.String;

public class Justpra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Happy more Happy you become";
		String[]arr=a.split(" ");
		String rev[]=new String[arr.length];

		for(int i=0;i<arr.length;i++) {
			String ae=arr[i];
			String re="";
			for(int j=ae.length()-1;j>=0;j--) {
				re=re+ae.charAt(j);
			
				}
			rev[i]=re;
			

		}
		for(var i:rev) {
			System.out.print(i+" ");
		}
	}

}
