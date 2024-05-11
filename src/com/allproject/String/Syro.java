package com.allproject.String;



class A{
	
	void display(int a){
	
		System.out.println("HI A"+a);
	}
}
class B extends A{
	
	void display(int b){
		//super.display(3);
		System.out.println("HI B"+b);
	}
}
public class Syro {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 B b=new B();
	  b.display(4);
		
		
		String a="Happy more Happy you become";
		String[]arr=a.split(" ");
		
		for(int i=arr.length-1;i>=0;i--) {
			String ae=arr[i];

			System.out.print(ae+" ");
			

		}
		
	}}
	


