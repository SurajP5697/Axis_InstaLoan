package com.allproject;

public class MaxinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {65,75,2,55,45,6,7,8,9};
		int max=arr[0];
		int sec=arr[0];
		//find max element in array
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				sec=max;
				max=arr[i];
			}
			else if(arr[i]>sec){
				sec=arr[i];
				
			}
		}
		System.out.println(max);
		System.out.println(sec);
		

	}

}
