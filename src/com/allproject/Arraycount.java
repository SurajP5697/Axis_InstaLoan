package com.allproject;

import java.util.HashMap;

public class Arraycount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char []arr={'A','B','C','A','A','A'};
		HashMap<Character,Integer>mp=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			if(mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i])+1);
			}
			else {
				mp.put(arr[i], 1);
			}
		}
		System.out.println(mp);
	
		int []ar= {72,3,45,1,23,56};
		int max=0;
		for(int i=0;i<ar.length;i++) {
			if(max<ar[i] ){
				
				max=ar[i];
			}
		}
		
		System.out.println(max);
	}

}
