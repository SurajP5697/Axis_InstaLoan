package com.allproject;

public class sumofn {
	
	public static void fact(int n) {
		int fact=1;
		while(n>0) {
			fact=fact*n;
			

		}
		System.out.println(fact);

		fact(n--);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		int num=2;
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
		fact(2);
		
		
	}

}
