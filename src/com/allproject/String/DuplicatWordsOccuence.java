package com.allproject.String;

import java.util.HashMap;
import java.util.Set;

public class DuplicatWordsOccuence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Raja is good at Study Raja is clever is";
		String[]arr=s.split(" ");
		HashMap<String,Integer> mp=new HashMap<>();
		for(String i:arr) {
			if(mp.containsKey(i)) {
				mp.put(i, mp.get(i)+1);
			}
			else {
				mp.put(i, 1);
			}
		}
		System.out.println(mp);
		Set<String> so=mp.keySet();
		for(var i:so) {
			int count=0;
			if(mp.get(i)>1) {
				count=mp.get(i);
			System.out.println(i+" repeted "+count+" times");
			}
		}
		
	}

}
