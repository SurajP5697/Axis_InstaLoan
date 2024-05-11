package com.allproject.String;

public class TotalnoofwordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="rtgoodok to move";
		char c='o';
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(c==s.charAt(i)) {
				count++;
			}
		}
		
		
		System.out.println(count);

	}

}
