package com.allproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		String s="My name is is Suraj My";
		Map<String,Integer>mp=new HashMap<>();
		String[]ada=s.split("");
//		char[] ad=s.toCharArray();
		for(int i=0;i<ada.length;i++) {
			System.out.print(ada[i]+" ");

		}
		
		for(int i=0;i<ada.length;i++) {
			if(mp.containsKey(ada[i])) {
				mp.put(ada[i],mp.get(ada[i])+1);
			}
			else {
				mp.put(ada[i], 1);
			}
		}
		System.out.println(mp);
		
		String so = "good good";
	      Stack<Character> st = new Stack<>();
	      st.push(so.charAt(0));
	      for (int i = 1; i<so.length(); i++ ) 
	      {
	         if (so.charAt(i-1) != so.charAt(i))
	            st.push(so.charAt(i));
	      }
	      for ( Character c : st )
	         System.out.print(c) ;
		
	}

}
