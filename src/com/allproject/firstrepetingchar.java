package com.allproject;

import java.util.HashMap;

public class firstrepetingchar {
	public static void main(String[] args) {
		String a="Peeks for Geeks";
		String ar=a.replaceAll("\\s", "");
		char []arr=ar.toCharArray();
		System.out.println(arr);
		HashMap<Character, Integer> mp=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			if(mp.containsKey(arr[i])) {
				mp.put(arr[i],mp.get(arr[i])+1);
			}
			else {
				mp.put(arr[i],1);
				
			}
		}
		
		System.out.println(mp);
		for(int i=0;i<arr.length;i++) {
			if(mp.get(arr[i])>1) {
				System.out.println(ar.charAt(i));
				break;
			}
		}
		
		
	}
	
}
