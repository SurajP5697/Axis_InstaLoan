package com.allproject.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplicatescharacterinString {
	public static void main(String[] args) {
		
		String s="raja is goof oj";
		String p=s.replaceAll("\\s", "");
		char[]arr=p.toCharArray();
		
		HashMap<Character, Integer> mp=new HashMap<Character, Integer>();
		
		for(var i:arr) {
			if(mp.containsKey(i)) {
				mp.put(i, mp.get(i)+1);
			}
			else {
				mp.put(i, 1);
			}
		}
		System.out.println(mp);
		Set<Character> sp=mp.keySet();
		for(var i:sp){
			if(mp.get(i)>1 && mp.get(i)!=' ') {
				System.out.println(i);
			}
		}
		
		
		
	}

}
