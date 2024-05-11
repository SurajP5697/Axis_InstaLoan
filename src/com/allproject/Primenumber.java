package com.allproject;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		boolean status=false;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				status=true;
				break;
			}
			
		
		}
		if(status==true) {
			System.out.println("not prime");
		}
		else {
			System.out.println("prime");

		}

	}

}
